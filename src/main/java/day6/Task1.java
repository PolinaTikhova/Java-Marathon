package day6;

public class Task1 {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.setModel("Toyota");
        auto.setColor("Черный");
        auto.setYear(2000);

        Motorbike bike = new Motorbike("Yamaha", "Красный", 2017);

        auto.info();
        System.out.println(auto.yearDifference());

        bike.info();
        System.out.println(bike.yearDifference());

    }
}
