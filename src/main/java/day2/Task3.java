package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b)
            System.out.println("Nothing");
        int r = a + 1;
        while (r < b) {
            if (r % 5 == 0) {
                if (r % 10 != 0)
                    System.out.println(r);
            }
        r = r + 1;
        }
    }
}