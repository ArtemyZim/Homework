package com.company.laba8.project15_07;

import java.util.Arrays;
import java.util.Scanner;

public class MainExample15_07 {
    public static void main(String[] args) {
        int [] nums = new int[0];
        int [] negNums;
        String strNums;
        
        System.out.println("Выполнение 2 варианта дополнительного задания");
        Scanner scan = new Scanner(System.in);

        strNums = scan.nextLine();
        strNums = strNums.replaceAll(" {2,}", " ");
        String [] m_strNums = strNums.split(" ");

        System.out.println("Ваши числа: " + Arrays.toString(m_strNums));

        try {
            nums = convertToInt(m_strNums);
        }catch (NumberFormatException e){
            System.out.println("Вы ввели некорректое значение");
        }
        negNums = negativeNums(nums);

        System.out.println("Сумма введенных Вами чисел, которые не делятся на 5 равна: ");
        System.out.println(sum(nums));
        System.out.print("Количество чисел, которые не делятся на 5: ");
        System.out.println(nums.length);
        System.out.println("Среднее значение среди этих чисел: ");
        System.out.println(midValue(nums));

        if (negNums[0] != 0) {
            System.out.println("Отрицательные числа, которые не делятся на 5: ");
            System.out.println(Arrays.toString(negNums));
            System.out.print("Максимальное и минимальное значения соотвественно: ");
            System.out.print(minValue(negNums) + " ");
            System.out.println(maxValue(negNums));
            if (minValue(negNums) != maxValue(negNums)) {
                System.out.println("Поменяем местами эти числа в начальном списке");
                replacement(m_strNums, negNums);
                System.out.println("Выведем данный список в терминал");
                System.out.println(Arrays.toString(m_strNums));
            }
            else {
                System.out.println("Данный список имеет только одно отрицательное число, которое не делится на 5");
                System.out.println(Arrays.toString(m_strNums));
            }
        }
        else System.out.println("Список не имеет отрицаельных чисел");
    }




    public static int sum(int...nums){
        int sum = 0;
        for (int x : nums) sum += x;
        return sum;
    }
    public static int[] convertToInt(String[] str) throws NumberFormatException{
        int counter = 0;
        for (String s : str) {
            if (Integer.parseInt(s) % 5 != 0) {
                counter++;
            }
        }
        int[] numbers = new int[counter];
        for (int i = 0, k = 0; i < str.length; i++){
            if (Integer.parseInt(str[i]) % 5 != 0){
                numbers[k] = Integer.parseInt(str[i]);
                k++;
            }
        }
        return numbers;
    }
    public static float midValue(int...nums){
        return ((float) sum(nums) / (float) nums.length);
    }
    public static int[] negativeNums(int...nums){
        int counter = 0;
        int[] negNums;

        for(int x : nums){
            if (x < 0) counter++;
        }

        if (counter != 0) {
            negNums = new int[counter];
            for (int i = 0, k = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    negNums[k] = nums[i];
                    k++;
                }
            }
        } else negNums = new int[]{0};

        return negNums;
    }
    public static int minValue(int...negNums){
        int minimum = 0;
        for (int x : negNums) minimum = Math.min(minimum, x);
        return minimum;
    }
    public static int maxValue(int...negNums){
        int maximum = negNums[0];
        for (int x : negNums) maximum = Math.max(maximum, x);
        return maximum;
    }

    public static void replacement(String [] m_str, int [] negNums){
        String str1 = minValue(negNums) + "";
        String str2 = maxValue(negNums) + "";
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < m_str.length; i++){
            if (str1.equals(m_str[i])) {
                index1 = i;
            }
            if (str2.equals(m_str[i])){
                index2 = i;
            }
        }
        m_str[index1] = str2;
        m_str[index2] = str1;
    }
}
