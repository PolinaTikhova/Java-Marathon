package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rm = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rm.nextInt(10000);

        int maxSum = 0;
        int maxInx = 0;
        for (int j = 0; j <= arr.length - 3; j++) {
            int sum = 0;
            for (int n = j; n < j + 3; n++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxInx = j;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(maxInx);
    }
}