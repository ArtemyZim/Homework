package com.company.timus;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_radix {
    static Scanner scan = new Scanner(System.in);
    static Stack<Double> stack = new Stack<>();

    public static void main(String[] args) {
        while(scan.hasNext()) {
            try {
                stack.push(scan.nextDouble());
            } catch (InputMismatchException ignored){}
        }
        while(!stack.empty()) {
            System.out.printf("%.4f\n", Math.sqrt(stack.pop()));
        }
    }
}
