package org.mpei.HomeWork_6;

import lombok.Data;

import java.io.File;
import java.util.Scanner;

@Data
public class PrintSerr implements Call {
    private String text = "";

    public PrintSerr() {
        try {
            String path = "C:\\Users\\Aglomiras\\IdeaProjects\\E-13m-23_MultAgent\\src\\main\\java\\org\\mpei\\HomeWork_6\\config.txt";
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                this.text += "\n";
                this.text += scanner.nextLine();
            }
            scanner.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @AutoCallable(nameA = "Std Err")
    public void printText() {
        System.err.println(text);
    }
}
