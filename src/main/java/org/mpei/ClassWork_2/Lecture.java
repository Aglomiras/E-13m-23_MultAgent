package org.mpei.ClassWork_2;

import org.mpei.ClassWork_2.Nasledovanie.MonsterNPS;
import org.mpei.ClassWork_2.Nasledovanie.NPC;
import org.mpei.ClassWork_2.Polimorfizm.HumanNPC;
import org.mpei.ClassWork_2.Polimorfizm.Walkabel;

import java.util.Arrays;

public class Lecture {
    public static void main(String[] args) {
        /**
         * У примитивов нет методов.
         * */

        String s = new String("Hello world!");
        String[] res = s.split(" "); //Разбиение строки
        boolean res1 = s.startsWith("Hel"); //Поиск комбинации букв в строке
        System.out.println(s.contains("world")); //Поиск комбинации букв в строке

        /**
         * ПРИНЦИПЫ ООП
         * О - ОБЪЕКТНО
         * О - ОРИЕНТИРОВАННОЕ
         * П - ПРОГРАММИРОВАНИЕ
         * */

        /**
         * НАСЛЕДОВАНИЕ (помогает уменьшить объем кода)
         * если перед классом написать (abstract) мы делаем класс абстрактным, тем самым запрещая создавать экземпляр
         * этого класса.
         * */

        NPC npc = new NPC();
        NPC mnpc = new MonsterNPS();

        npc.attack();
        mnpc.attack();

        /**
         * ПОЛИМОРФИЗМ (способность одного класса вести себя как другой)
         * */

        MonsterNPS monsterNPS = new MonsterNPS();
        HumanNPC humanNPC = new HumanNPC();

//        runAway(monsterNPS);
        runAway(humanNPC);

        Walkabel[] monsterNPS1 = new Walkabel[2];
//        monsterNPS1[0] = monsterNPS;
        monsterNPS1[1] = humanNPC;
        System.out.println(Arrays.toString(monsterNPS1));

    }
    static void runAway(Walkabel w) {
        w.walk();
    }


}
