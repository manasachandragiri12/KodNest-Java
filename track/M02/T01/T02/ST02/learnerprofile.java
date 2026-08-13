import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javascore;
}

public class learnerprofile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // First learner
        Learner f1 = new Learner();

        f1.id = scanner.nextInt();
        f1.name = scanner.next();
        f1.javascore = scanner.nextInt();

        // Second learner
        Learner f2 = new Learner();

        f2.id = scanner.nextInt();
        f2.name = scanner.next();
        f2.javascore = scanner.nextInt();

        // New score
        int newscore = scanner.nextInt();

        // Before update
        System.out.println("Before Update");
        System.out.println(f1.id + " - " + f1.name + " - " + f1.javascore);
        System.out.println(f2.id + " - " + f2.name + " - " + f2.javascore);

        // Update only first learner
        f1.javascore = newscore;

        // After update
        System.out.println("After Update");
        System.out.println(f1.id + " - " + f1.name + " - " + f1.javascore);
        System.out.println(f2.id + " - " + f2.name + " - " + f2.javascore);
    }
}