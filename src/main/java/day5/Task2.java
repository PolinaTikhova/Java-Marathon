package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("BMW", "Белый", 2017);
        System.out.println("Марка мотоцикла: " + bike.getModel());
        System.out.println("Цвет мотоцикла: " + bike.getColor());
        System.out.println("Год выпуска: " + bike.getYear());
    }
}
