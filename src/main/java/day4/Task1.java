package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        int b = 0;
        int c = 0;
        int f = 0;
        int sum = 0;
        for (int i : arr) {
            arr[i] = rm.nextInt(11);
            System.out.print(arr[i] + " ");

            if (arr[i]>8){
                x++;
            }
            if (arr[i] == 1){
                b++;
            }
            if (arr[i] % 2 == 0){
                c++;
            }
            if (arr[i] % 2 == 1) {
                f++;
            }
            sum = sum + arr[i];
            }

        System.out.println();
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + x);
        System.out.println("Количество чисел равных 1: " + b);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: " + f);
        System.out.println("Сумма всех элементов массива: " + sum);
        }

    }

