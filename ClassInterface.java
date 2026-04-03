interface Exam {
    double percent_cal();
}

class Student {
    String name;
    int roll_no;
    double marks1, marks2;

    Student(String name, int roll_no, double marks1, double marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result extends Student implements Exam {
    double per;

    Result(String name, int roll_no, double marks1, double marks2) {
        super(name, roll_no, marks1, marks2);
    }

    public double percent_cal() {
        per = (marks1 + marks2) / 2;
        return per;
    }

    void display() {
        show();
        System.out.println("Percentage: " + percent_cal());
    }
}

public class ClassInterface {
    public static void main(String[] args) {
        Result r = new Result("Ridreb", 101, 80, 90);
        r.display();
    }
}