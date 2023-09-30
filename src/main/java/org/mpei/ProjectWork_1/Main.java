package org.mpei.ProjectWork_1;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\Aglomiras\\OneDrive\\Изображения\\Рабочий стол\\КУРСЫ\\COMTRADE\\04\\Number start = 691 Test = 4.1.2.1.2 Time = 07_19_2022 13_50_48.925 RTDS.dat");

//        byte octet = 5;
//        String bin = String.format("%8s", Integer.toBinaryString(octet)).replace(' ', '0');
//        System.out.println(bin);
//
//        byte data = 0b101;
//        System.out.println(data);
//
//        byte[] b = {(byte) 99, (byte) 97, (byte) 116};
//        String s = new String(b, StandardCharsets.US_ASCII);
//
//        byte[] bytes = {(byte)13875, (byte)12332, (byte)30, (byte)38, (byte)32};
//        String sys = new String(bytes, StandardCharsets.UTF_8);

//        File file = new File(
//                "C:\\Users\\Aglomiras\\OneDrive\\Изображения\\Рабочий стол\\КУРСЫ\\COMTRADE\\04");

        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\Aglomiras\\OneDrive\\Изображения\\Рабочий стол\\КУРСЫ\\COMTRADE\\04\\Number start = 691 Test = 4.1.2.1.2 Time = 07_19_2022 13_50_48.925 RTDS.dat"));
//        BufferedInputStream reader = new BufferedInputStream(file.getInputStream());
//        bytes = reader.readAllBytes();
//        int value = 0;
//        for (byte b : bytes) {
//            value = (value << 8) + (b & 0xFF);
//            value = b & 0xFF;
//            System.out.print(value + " ");
//        }

//        byte[] bytes = new byte[Float.BYTES];
//        int length = bytes.length;
//        System.out.println(bytes);

//        System.out.println(length);
        for (int i = 0; i < 4000; i++) {
//            int intValue = bytes[i];

            if (i == 0 || i == 4) {
                byte c1 = bytes[i];
                System.out.println(c1);
//                System.out.println((int) c1 & 0xFF);
                System.out.println(String.format("%02x", c1));
                i += 1;
                byte c2 = bytes[i];
                System.out.println(c2);
//                System.out.println((int) c1 & 0xFF);
                System.out.println(String.format("%02x", c2));
                i += 1;
                byte c3 = bytes[i];
                i += 1;
                byte c4 = bytes[i];
                i += 1;

                System.out.println((c1 & 0xFF) | (c2 & 0xFF) << 8 | (c3 & 0xFF) << 16 | (c4 & 0xFF) << 24);

                System.out.println(String.format("%c%c%c%c", c1, c2, c3, c4));

                byte c5 = bytes[i];
                i += 1;
                byte c6 = bytes[i];
                i += 1;
                byte c7 = bytes[i];
                i += 1;
                byte c8 = bytes[i];
                i += 1;
                System.out.println((c5 & 0xFF) | (c6 & 0xFF) << 8 | (c7 & 0xFF) << 16 | (c8 & 0xFF) << 24);

                System.out.println(Integer.parseInt(String.format("%c%c%c%c", c5, c6, c7, c8)));

                byte c9 = bytes[i];
                i += 1;
                byte c10 = bytes[i];
                i += 1;
                System.out.println((c9 & 0xFF) | (c10 & 0xFF) << 8);
                System.out.println(String.format("%c%c", c9, c10));
            }
        }
    }
}
