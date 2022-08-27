package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int [100];
        Random rm = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rm.nextInt(10000);
        int max = 0;
        int min = 10000;
        int pro10 = 0;
        int sum = 0;
        for (int m : arr) {
            if(m > max)
                max = m;

            if (m < min)
                min = m;

            if (m % 10 == 0)
                pro10 ++;
            if (m % 10 == 0)
                sum = sum + m;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(pro10);
        System.out.println(sum);





    }
}
