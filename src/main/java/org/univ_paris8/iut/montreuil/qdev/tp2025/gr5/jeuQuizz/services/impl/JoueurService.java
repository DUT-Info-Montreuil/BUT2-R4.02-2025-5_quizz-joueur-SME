package org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.execptions.joueur_exception.*;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.constants.JoueurStaticFunction;

import java.util.ArrayList;

public class JoueurService implements JoueurInterface {
    @Override
    public JoueurDTO addJoueurDTO(String pseudo, String prenom, int anneeNaissance, String centreInteret, int languePref) throws AddJoueurException {
        try {
            if (pseudo == null || pseudo.isEmpty() || Character.isDigit(pseudo.charAt(0))) {
                throw new PseudoInvalideException("Le pseudo est invalide : il ne doit pas être vide ni commencer par un chiffre");
            }
            if (prenom == null || prenom.isEmpty()) {
                throw new PrenomInvalideException("Le prénom ne peut pas être vide");
            }
            if (centreInteret == null || centreInteret.isEmpty()) {
                throw new CentreInteretInvalideException("Le centre d'intérêts doivent être séparer par des virgules");
            }
            Enum<Langue> langueChoisi = Langue.getById(languePref);
            if (langueChoisi == null) {
                throw new LangueInvalideException("La langue préférée est invalide. Veuillez choisir une langue valide (entre 1-5).");
            }
            ArrayList<String> centreInteretList = JoueurStaticFunction.stringToList(centreInteret);

            return new JoueurDTO(pseudo, prenom, anneeNaissance, centreInteretList, langueChoisi);

        } catch (PseudoInvalideException | PrenomInvalideException | CentreInteretInvalideException |
                 LangueInvalideException e) {
            throw e;
        } catch (Exception e) {
            throw new AddJoueurException("Une erreur est survenue lors de l'ajout du joueur : " + e.getMessage());
        }
    }
}
