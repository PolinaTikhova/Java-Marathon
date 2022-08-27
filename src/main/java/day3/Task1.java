package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mob = sc.nextLine();
        switch(mob){
            case "Moscow":
            case "Vladivostok":
            case "Rostov":
                System.out.println("Russia");
                break;
            case "Rome":
            case "Milan":
            case "Turin":
                System.out.println("Italy");
                break;
            case "Liverpool":
            case "Manchester":
            case "London":
                System.out.println("England");
                break;
            case "Berlin":
            case "Munich":
            case "Cologne":
                System.out.println("Germany");
                break;
            default:
                System.out.println("Unknown of country");
            case "Stop":
                break;
        }
    }
}
