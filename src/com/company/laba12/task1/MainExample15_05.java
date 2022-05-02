package com.company.laba12.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainExample15_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/com/company/laba12/task1/MyFile1.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("src/com/company/laba12/task1/MyFile2.txt", StandardCharsets.UTF_8);

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null){
                lineCount++;
                out.println(lineCount + ": " + s);

            }
        } catch (IOException e){
            System.out.println("Ошибка!");
        }finally {

            br.close();
            out.flush();
            out.close();
        }
    }
}
