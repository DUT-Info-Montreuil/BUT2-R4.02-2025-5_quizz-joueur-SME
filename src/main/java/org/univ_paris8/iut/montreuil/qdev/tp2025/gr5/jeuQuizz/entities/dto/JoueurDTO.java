package org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.entities.dto;

/*

Nom de la méthode : addJoueurDTO
Données renvoyées : JoueurDTO
Paramètres d’entrée : String pseudo, String prenom, int anneeNaissance, String centreInteret, Enum<Langue> languePref
Exceptions levées : Chaine vide, Pseudo non unique, Pseudo commence par chiffre, Non entier, Mauvais séparateur pour centre d’intérêts, Chaine vide et mauvais séparateur pour centre d’intérêts, Chiffre non compris entre 1 et 5 pour la languePref
Signature : public JoueurDTO addJoueurDTO(String pseudo, String prenom, int anneeNaissance, String centreInteret, Enum<Langue> languePref) throw AddJoueurException
 */

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.enums.Langue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JoueurDTO {

    private String pseudo;
    private String prenom;
    private ArrayList<String> centreInteret;
    private int anneeNaissance;
    private Enum<Langue> languePref;

    public JoueurDTO(String pseudo, String prenom, int anneeNaissance, ArrayList<String> centreInteret, Enum<Langue> languePref) {
        this.pseudo = pseudo;
        this.prenom = prenom;
        this.centreInteret = centreInteret;
        this.anneeNaissance = anneeNaissance;
        this.languePref = languePref;
    }
}
