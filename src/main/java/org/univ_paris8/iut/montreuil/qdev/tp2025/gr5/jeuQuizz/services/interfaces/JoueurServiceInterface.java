package org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.execptions.joueur_exception.AddJoueurException;

public interface JoueurServiceInterface {

    JoueurDTO addJoueurDTO(String pseudo, String prenom, int anneeNaissance, String centreInteret, int languePref) throws AddJoueurException;
}
