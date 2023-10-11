package org.mpei.HomeWork_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintSout printSout = new PrintSout();
        PrintSerr printSerr = new PrintSerr();

        String path = "C:\\Users\\Aglomiras\\IdeaProjects\\E-13m-23_MultAgent\\src\\main\\java\\org\\mpei\\HomeWork_6\\config.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();

        printSout.printText(text);
        printSerr.printText(text);
    }
}
