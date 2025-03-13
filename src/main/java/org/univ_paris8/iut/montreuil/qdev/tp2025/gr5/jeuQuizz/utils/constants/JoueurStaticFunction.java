package org.univ_paris8.iut.montreuil.qdev.tp2025.gr5.jeuQuizz.utils.constants;

import java.util.ArrayList;

public class JoueurStaticFunction {

    public static ArrayList<String> stringToList(String string) {
        ArrayList<String> list = new ArrayList<>();
        String[] elements = string.split(",");
        for (String element : elements) {
            list.add(element.trim());
        }
        return list;
    }


}
