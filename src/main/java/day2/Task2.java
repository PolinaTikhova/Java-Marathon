package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= b)
            System.out.println("Nothing");
        for(int m = a + 1; m < b; m++) {
            if(m % 5 == 0) {
                if (m % 10 != 0){
                    System.out.println(m);
                }
            }
        }
    }
}
