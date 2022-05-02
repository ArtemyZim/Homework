package com.company.laba12.task1;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class MainExample15_03 {
    public static void main(String[] args) {

        try {
            InputStream inFile = new FileInputStream("src/com/company/laba12/task1/MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, StandardCharsets.UTF_8);

            readAllByByte(rFile);
            System.out.println("\n\n");
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, StandardCharsets.UTF_8);

            readAllByByte(rUrl);
            System.out.println("\n\n");
            inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{56, 81, 35, 92, 111});
            Reader rArray = new InputStreamReader(inArray, StandardCharsets.UTF_8);

            readAllByByte(rArray);
            System.out.println("\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("Ошибка" + e);
        }

    }
    public static void readAllByByte(Reader in) throws IOException {
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char) oneByte);
            }else {
                System.out.print("\n" + "конец");
                break;
            }
        }
    }
}
