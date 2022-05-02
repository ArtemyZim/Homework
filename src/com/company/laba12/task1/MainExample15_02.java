package com.company.laba12.task1;

import java.io.*;

public class MainExample15_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            br = new BufferedReader(new FileReader("src/com/company/laba12/task1/MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("src/com/company/laba12/task1/MyFile2.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Ошибка");
        }finally {
            br.close();
            out.flush();
            out.close();
        }

    }
}
