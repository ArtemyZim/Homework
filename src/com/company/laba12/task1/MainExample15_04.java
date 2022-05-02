package com.company.laba12.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainExample15_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/com/company/laba12/task1/MyFile1.txt"), StandardCharsets.UTF_8));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/com/company/laba12/task1/MyFile2.txt"), StandardCharsets.UTF_8));
            int lineCount = 0;
            String s;
            while((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Ошибка!!");
        }finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
