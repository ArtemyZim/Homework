package com.company.laba3;
import java.util.Objects;
import java.util.Scanner;
public class example14_02_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Input a name of the weekday: ");
            String weekday = scan.next();
            if (Objects.equals(weekday, "Monday") || Objects.equals(weekday, "monday")){
                flag = false;
                if (weekday.equals("Monday")) {
                    System.out.println("This is the first day of week");
                }
                if (weekday.equals("monday")) {
                    System.out.println("This is the first day of week");
                }
            }
            else if (Objects.equals(weekday, "Tuesday") || Objects.equals(weekday, "tuesday")) {
                flag = false;
                if (weekday.equals("Tuesday")) {
                    System.out.println("This is the second day of week");
                }
                if (weekday.equals("tuesday")) {
                    System.out.println("This is the second day of week");
                }
            }
            else if (weekday.equals("Wednesday") || weekday.equals("wednesday")) {
                flag = false;
                if (weekday.equals("Wednesday")) {
                    System.out.println("This is the third day of week");
                }
                if (weekday.equals("wednesday")) {
                    System.out.println("this is the third day of week");
                }
            }
            else if (weekday.equals("Thursday") || weekday.equals("thursday")) {
                flag = false;
                if (weekday.equals("Thursday")) {
                    System.out.println("This is the fourth day of week");
                }
                if (weekday.equals("thursday")) {
                    System.out.println("This is teh fourth day of week");
                }
            }
            else if (weekday.equals("Friday") || weekday.equals("friday")) {
                flag = false;
                if (weekday.equals("Friday")) {
                    System.out.println("This is the fifth day of week");
                }
                if (weekday.equals("friday")) {
                    System.out.println("This is the fifth day of week");
                }
            }
            else if (weekday.equals("Saturday") || weekday.equals("saturday")) {
                flag = false;
                if (weekday.equals("Saturday")) {
                    System.out.println("This is the sixth day of week");
                }
                if (weekday.equals("saturday")) {
                    System.out.println("This is the sixth day of week");
                }
            }
            else if (weekday.equals("Sunday") || weekday.equals("sunday")) {
                flag = false;
                if (weekday.equals("Sunday")) {
                    System.out.println("This is the seventh day of week");
                }
                if (weekday.equals("sunday")){
                    System.out.println("This is the seventh day of week");
                }
            }
            else System.out.println("There is no day of week with that name");

        } while(flag);
    }
}
