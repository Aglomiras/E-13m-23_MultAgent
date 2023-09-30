package org.mpei.ProjectWork_1;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class assasasas {
    public static void main(String[] args) {
        System.out.println(getFile());
    }


    @SneakyThrows
    public static List<List<Integer>> getFile() {

//        String set = "C:\\\\Users\\\\Aglomiras\\\\OneDrive\\\\Изображения\\\\Рабочий стол\\\\КУРСЫ\\\\COMTRADE\\\\05\\\\Number start = 691 Test = 4.1.2.1.2 Time = 07_19_2022 13_50_48.925 Terminal ПСА.dat";
        String set1 = "C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000_B.dat";
//        String set2 = "C:\\Users\\Aglomiras\\OneDrive\\Изображения\\Рабочий стол\\КУРСЫ\\COMTRADE\\02\\Number start = 690 Test = 4.1.2.1.1 Time = 07_19_2022 13_50_13.811 Terminal ПСА.dat";

//        byte[] dat = Files.readAllBytes(Paths.get("C:\\Users\\Aglomiras\\Downloads\\Telegram Desktop\\DR_Number_1_525000_B.dat"));

        List<List<Integer>> newFile = new ArrayList<>();
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(set1));

        try {
            for (int j = 0; j < 1000; j++) {
                newFile.add(new ArrayList<>());
                boolean flag = true;
                int i = 0;
                while (flag) {
                    if (i == 0 || i == 4) {
                        int c1 = reader.read();
                        i += 1;
                        int c2 = reader.read();
                        i += 1;
                        int c3 = reader.read();
                        i += 1;
                        int c4 = reader.read();
                        i += 1;
                        newFile.get(j).add((c1 & 0xFF) | (c2 & 0xFF) << 8 | (c3 & 0xFF) << 16 | (c4 & 0xFF) << 24);
                    } else if (i > 4 && i < 46) {
                        byte c1 = (byte) reader.read();
                        i += 1;
                        byte c2 = (byte) reader.read();
                        i += 1;
                        newFile.get(j).add((c1 & 0xFF | (c2 & 0xFF) << 8));
//                        if ((c1 & 0xFF | (c2 & 0xFF) << 8) > 32767){
//                            newFile.get(j).add((~c1 & 0xFF | (~c2 & 0xFF) << 8)*-1);
//                        }else{
//                            newFile.get(j).add((c1 & 0xFF | (c2 & 0xFF) << 8));
//                        }

//                    } else if (i >= 74 && i < 340){
//                        byte c1 = (byte) reader.read();
//                        i += 1;
//                        byte c2 = (byte) reader.read();
//                        i += 1;
////                        newFile.get(j).add((c1 & 0xFF | (c2 & 0xFF) << 8));
//                        if ((c1 & 0xFF | (c2 & 0xFF) << 8) > 32767){
//                            newFile.get(j).add((~c1 & 0xFF | (~c2 & 0xFF) << 8)*-1);
//                        }else{
//                            newFile.get(j).add((c1 & 0xFF | (c2 & 0xFF) << 8));
//                        }

                    } else {
                        int c1 = reader.read();
                        i += 1;
//                        int c2 = reader.read();
//                        i += 1;
//                        newFile.get(j).add((c1 & 0xFF | (c2 & 0xFF) << 8));
                    }
                    if (i == 48) {
                        flag = false;
                    }
                }
            }
        } catch (Exception e) {
            reader.close();
        }
        return newFile;
    }
}
