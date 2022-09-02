package day6;

public class Motorbike {
    private final String model;
    private final String color;
    private final int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel(){

        return model;
    }
    public String getColor(){

        return color;
    }
    public int getYear(){

        return year;
    }
    void info(){

        System.out.println("Это мотоцикл");
    }
    int yearDifference(){
        int inputYear = 2022 - year;
        return inputYear;
    }
}
