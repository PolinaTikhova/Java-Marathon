package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(0<m&&m<=4){
            System.out.println("low house");
        } else if(4<m&&m<=8){
            System.out.println("medium house");
        } else if(m>=9){
            System.out.println("high house");
        } else{
            System.out.println("Nothing");
        }

    }
}
