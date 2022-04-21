package com.company.laba11.task1;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class MainExample15_08 {
    public static void main(String[] args) {
        try{
            InputStream inFile = new FileInputStream("C:\\tmp\\text.txt");
            Reader rFile = new InputStreamReader(inFile, StandardCharsets.UTF_8);
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inURL = new URL("http://google.com").openStream();
            Reader rURL = new InputStreamReader(inURL, StandardCharsets.UTF_8);
            readAllByByte(rURL);
            System.out.print("\n\n\n");
            inURL.close();
            rURL.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{55, 86, 98, 124, 105, 100});
            Reader rArray = new InputStreamReader(inArray, StandardCharsets.UTF_8);
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();

        } catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
    public static void readAllByByte(Reader in) throws IOException{

        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "конец");
                break;
            }
        }
    }
}
