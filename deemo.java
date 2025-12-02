import java.util.Scanner;

class student {
    String name;
    int age;

    void display() {
        System.out.println("Name:  ," + name + " Age: " + age);
    }
}

public class deemo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "virat kohli";
        s1.age = 37;
        s1.display();
    }
}
