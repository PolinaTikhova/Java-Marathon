package day5;

public class Task1 {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.setModel("Chevrolet Impala");
        auto.setColor("Черный");
        auto.setYear(1967);
        System.out.println("Марка автомобиля: " + auto.getModel());
        System.out.println("Цвет автомобиля: " + auto.getColor());
        System.out.println("Год выпуска: " + auto.getYear());
    }
}
