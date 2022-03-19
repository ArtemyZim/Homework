package com.company.timus;

import java.util.Scanner;
public class One_warrior {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tests = scan.nextInt();
        String [] cells = new String[tests];

        int [] numbers = new int[tests];
        char [] letters = new char[tests];

        for (int i = 0; i < tests; i++) {
            cells[i] = scan.next();
            letters[i] = cells[i].charAt(0);
            numbers[i] = cells[i].charAt(1);
        }

        for (int i = 0; i < tests; i++){
            int turn_nums =0;
            if (numbers[i] - 2 >= '1' && letters[i] + 1 <= 'h') turn_nums++;
            if (numbers[i] - 2 >= '1' && letters[i] - 1 >= 'a') turn_nums++;
            if (letters[i] + 2 <= 'h' && numbers[i] + 1 <= '8') turn_nums++;
            if (letters[i] + 2 <= 'h' && numbers[i] - 1 >= '1') turn_nums++;
            if (numbers[i] + 2 <= '8' && letters[i] + 1 <= 'h') turn_nums++;
            if (numbers[i] + 2 <= '8' && letters[i] - 1 >= 'a') turn_nums++;
            if (letters[i] - 2 >= 'a' && numbers[i] + 1 <= '8') turn_nums++;
            if (letters[i] - 2 >= 'a' && numbers[i] - 1 >= '1') turn_nums++;
            System.out.println(turn_nums);
        }
    }
}
