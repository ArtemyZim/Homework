package com.company.OPDlaba3;

import java.util.Scanner;
public class Deadline_budget {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int plan_budget, cur_budget, percent, real_budget;
        float plan_month, cur_month, real_month;

        do {
            System.out.print("Введите плановый бюджет вашего проекта: ");
            while (!scan.hasNextInt()){
                System.out.println("Вы ввели неверное значение");
                System.out.print("Введите целочисленное значение: ");
                scan.next();
            }
            plan_budget = scan.nextInt();
            if (plan_budget <= 0){
                System.out.println("Значения 0 и ниже недопустимы");
            }
        } while (plan_budget <= 0);

        do {
            System.out.print("Введите плановый срок выполнения проекта в месяцах: ");
            while (!scan.hasNextFloat()){
                System.out.println("Вы ввели неверное значение");
                System.out.print("Введите значение типа float: ");
                scan.next();
            }
            plan_month = scan.nextFloat();
            if (plan_month <= 0) System.out.println("Значения 0 и ниже недопустимы");
        } while (plan_month <= 0);

        do{
            System.out.print("Введите текущий израсходованный бюджет: ");
            cur_budget = scan.nextInt();
        } while (cur_budget < 0);

        do{
            System.out.print("Сколько месяцев прошло с момента начала проекта: ");
            cur_month = scan.nextFloat();
        } while (cur_month > plan_month ||cur_month <= 0);

        do{
            System.out.print("Сколько процентов проекта завершено (введите значение от 0 до 100): ");
            percent = scan.nextInt();
        } while (percent < 0 || percent > 100);

        real_month = (100 * cur_month) / percent;

        if (real_month <= plan_month){
            System.out.println("Задержки по времени нет");
        }
        else {
            System.out.printf("Задержка по времени составит %.1f мес.", (real_month - plan_month));
        }
        System.out.println();
        real_budget = (100 * cur_budget) / percent;

        if (real_budget <= plan_budget) System.out.println("Перерасхода нет");
        else System.out.println("Перерасход бюджета составит " + (real_budget - plan_budget) + " у. е.");

    }
}
