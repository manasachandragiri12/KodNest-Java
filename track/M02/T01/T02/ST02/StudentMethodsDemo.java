import java.util.Scanner;

class MyStudent {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class StudentMethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MyStudent student = new MyStudent();

        student.setName(name);
        student.showName();
        student.showScore(first);
        student.showScore(first, second);

        scanner.close();
    }
}