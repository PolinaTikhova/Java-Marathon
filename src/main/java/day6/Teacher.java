package day6;


public class Teacher {
    private String name;
    private String lessons;

    public Teacher(String name, String lessons ) {
        this.name = name;
        this.lessons = lessons;
    }
    void evaluate(Student student){
        int bad = 2;
        int excellent = 6;
        int mark = (int) (Math.random() * (excellent - bad) + bad);
        if (mark == 5) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lessons + " на оценку "  + "отлично.");
            }
        else if (mark == 4) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lessons + " на оценку " + "хорошо.");
            }
        else if (mark == 3) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lessons + " на оценку " + "удовлетворительно.");
            }
        else if (mark == 2) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lessons + " на оценку " + "неудовлетворительно.");
            }

        }
    }
