package com.company.laba11.task1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainExample15_02 {
    public static void main(String[] args) throws IOException{
        try {
            InputStream inFile = new FileInputStream("C:\\tmp\\text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inURL = new URL("http://google.com").openStream();
            readAllByByte(inURL);
            System.out.print("\n\n\n");
            inURL.close();

            InputStream inArray = new ByteArrayInputStream(new byte [] {7, 9, 3, 7, 4, 5, 6});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();

        } catch (IOException e){
            System.out.println("Ошибка " + e);
        }
    }
    public static void readAllByByte(InputStream in) throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte != -1) System.out.print((char) oneByte);
            else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
