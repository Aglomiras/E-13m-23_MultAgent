package org.mpei.ProjectWork_1;

import lombok.SneakyThrows;
import org.mpei.ClassWork_4.Lecture;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Suka {
    @SneakyThrows
    public static void main(String[] args) {
//        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\Aglomiras\\OneDrive\\Изображения\\Рабочий стол\\КУРСЫ\\COMTRADE\\04\\Number start = 691 Test = 4.1.2.1.2 Time = 07_19_2022 13_50_48.925 RTDS.dat"));
        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000.dat"));
        List<List<Integer>> pizda = new ArrayList<>();

        StringBuilder sbeta = new StringBuilder();

        List<String> suuuuuuks = new ArrayList<>();

        char[] pisia = new char[bytes.length];
        for(int i = 0; i < 1000; i++) {
            pisia[i] = (char) bytes[i];
//            System.out.print(pisia[i]);

            if (bytes[i] == 0x0A) { //|| bytes[i] == 0x0D) {
                suuuuuuks.add(sbeta.toString());
                sbeta.setLength(0);
//                i++;//Для ВКР файла
                continue;
            }
            sbeta.append(pisia[i]);
        }
        System.out.println(suuuuuuks);

        List<List<Integer>> huo = new ArrayList<>();

        for (String s : suuuuuuks) {
//            System.out.println(s.split(","));

            List<Integer> das = new ArrayList<>();

            for (String ad : s.split(",")) {
                das.add(Integer.parseInt(ad));
            }
            huo.add(das);
        }
        for (int i = 0; i < huo.size(); i++) {
            System.out.println(huo.get(i));
        }
    }
}
