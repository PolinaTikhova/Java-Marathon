package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mtc = new int[12][8];
        Random rm = new Random();
        int maxInx = 0;
        int maxSum = 0;
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int h = 0; h < 8; h++) {
                mtc[i][h] = rm.nextInt(50);
                sum = sum + mtc[i][h];
            }
            if (sum >= maxSum) {
                    maxSum = sum;
                    maxInx = i;
                }
            }
        System.out.println(maxInx);
    }
}