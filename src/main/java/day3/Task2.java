package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double k = sc.nextDouble();
            double m = sc.nextDouble();
            if (m == 0)
                break;
            double div = k / m;
            System.out.println(div);
        }
    }
}
