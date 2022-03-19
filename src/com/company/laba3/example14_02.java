package com.company.laba3;

import java.util.Scanner;

public class example14_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Input day of week: ");
            String weekday = scan.next();
            switch (weekday) {
                case "Monday":
                    System.out.println("This is the first day of week");
                    flag = false;
                    break;
                case "Tuesday":
                    System.out.println("This is the second day of week");
                    flag = false;
                    break;
                case "Wednesday":
                    System.out.println("This is the third day of week");
                    flag = false;
                    break;
                case "Thursday":
                    System.out.println("This is the fourth day of week");
                    flag = false;
                    break;
                case "Friday":
                    System.out.println("This is the fifth day of week");
                    flag = false;
                    break;
                case "Saturday":
                    System.out.println("This is the sixth day of week");
                    flag = false;
                    break;
                case "Sunday":
                    System.out.println("This is the seventh day of week");
                    flag = false;
                    break;
                default:
                    System.out.println("There is no day of week with that name");
            }
        } while (flag);
    }
}
