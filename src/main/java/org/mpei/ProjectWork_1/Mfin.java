package org.mpei.ProjectWork_1;

import java.util.List;

public class Mfin {
    public static void main(String[] args) {
        List<String> pb = List.of("ЭнМИ", "ИЭВТ", "ИнЭИ", "ИЭЭ", "ИГВИЭ", "ГПИ", "ИРЭ", "ИЭТЭ", "ИТАЭ", "ИВТИ");
        List<String> dobrieSlova = List.of("Лучшие!", "Самые ядерные!",
                "Няшки!", "Самые добрые!", "Наши звездочки *-*", "Незабываемые!",
                "Самые стойкие!", "Печеньки!", "На вайбе!", "Первые!");

        for (int i = 0; i < pb.size(); i++) {
            System.out.println("ПБ " + pb.get(i) + " " + dobrieSlova.get((int) (Math.random() * 10)));
        }
    }
}
