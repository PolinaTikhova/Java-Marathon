package day2;

import java.util.Scanner;
import static java.lang.Math.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x >= 5) {
            y = (pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        } else if (-3 < x && x <= 4) {
            y = (x + 3) * (pow(x, 2));
            System.out.println(y);
        } else {
            System.out.println(420);
        }
    }
}
