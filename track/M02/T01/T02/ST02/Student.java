public class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

class Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.input("Rani", 18, 5.3);
        s.display(); 
    }
}