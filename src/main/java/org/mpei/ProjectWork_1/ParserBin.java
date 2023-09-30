package org.mpei.ProjectWork_1;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ParserBin {
    @SneakyThrows
    public static void main(String[] args) {
        byte[] fileDat = Files.readAllBytes(Paths.get("C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000_B.dat"));
        String karta = "C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000.dat";


    }

    @SneakyThrows
    public int parsCFG(String karta) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000.cfg"));
        bufferedReader.readLine();
        String bbb = bufferedReader.readLine();
//        System.out.println(bbb);
        String[] chanel = bbb.split(",");
        int a = Integer.parseInt(chanel[0]);
        int b = Integer.parseInt(chanel[1].replace("A", ""));
        int c = Integer.parseInt(chanel[2].replace("D", ""));
//        System.out.println(a + " " + b + " " + c);
        return 4;
    }
}
