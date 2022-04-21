package com.company.laba11.task3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainExample15 {
    public static void main(String[] args){

        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        String punctuation = "!.,?";
        String pathFile1 = "src\\com\\company\\laba11\\task3\\stringsText.txt";
        String pathFile2 = "src\\com\\company\\laba11\\task3\\stringsOut.txt";
        BufferedReader br;
        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(pathFile1), StandardCharsets.UTF_8));
            PrintWriter out = new PrintWriter(pathFile2, StandardCharsets.UTF_8);

            int lineCount = 0;
            int wordsCount;
            String s;
            String [] words;
            while ((s = br.readLine()) != null){
                wordsCount = 0;
                lineCount++;
                words = s.split(" ");
                for (String word : words) {

                    if (!vowels.contains(Character.toString(word.charAt(0)))) {
                        if (punctuation.contains(Character.toString(word.charAt(word.length()-1)))){
                            out.println("Слово: '" + word.substring(0 , word.length()-1)
                                                 + "' (Строка в исходном файле: #" + lineCount + ")");
                            wordsCount++;
                        }
                        else {
                            out.println("Слово: '" + word
                                    + "' (Строка в исходном файле: #" + lineCount + ")");
                            wordsCount++;
                        }
                    }
                }
                out.printf("В %d строке выбрано %d слов \n\n", lineCount, wordsCount);
            }
            br.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        }

    }
}
