import java.util.Scanner;

class StudentInfo {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class namethis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        StudentInfo s1 = new StudentInfo();

        s1.setName(name);
        s1.displayName();

        scanner.close();
    }
}