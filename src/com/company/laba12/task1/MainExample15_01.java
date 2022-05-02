package com.company.laba12.task1;

import java.io.*;

public class MainExample15_01 {
    public static void main(String[] args) throws IOException {

        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("src/com/company/laba12/task1/MyFile1.txt");
            out = new FileWriter("src/com/company/laba12/task1/MyFile2.txt", true);

            int oneByte;
            while((oneByte = in.read()) != -1){
//                out.write((char) oneByte);
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        }catch (IOException e){
            System.out.println("Ошибка!");
        } finally {
            in.close();
            out.close();
        }
    }
}
