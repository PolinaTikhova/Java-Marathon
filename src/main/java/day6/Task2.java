package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 70, 180);

        airplane.setYear(2020);
        airplane.setLength(110);

        airplane.fillUp(63);
        airplane.fillUp(85);

        airplane.info();
    }
}

