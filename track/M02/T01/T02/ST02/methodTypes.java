import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class methodTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int firstnumber = scanner.nextInt();
        int secondnumber = scanner.nextInt();

        MethodDemo m = new MethodDemo();

        m.sayHello();
        m.greet(name);

        int luckyNumber = m.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int sum = m.add(firstnumber, secondnumber);
        System.out.println("Sum: " + sum);
    }
}