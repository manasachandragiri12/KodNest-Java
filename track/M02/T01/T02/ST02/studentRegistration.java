import java.util.Scanner;

class RegistrationStudent {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class studentRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RegistrationStudent s1 = new RegistrationStudent();
        s1.registrationId = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        RegistrationStudent s2 = new RegistrationStudent();
        s2.registrationId = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        RegistrationStudent selectedStudent = null;

        if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectedId == s2.registrationId) {
            selectedStudent = s2;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(s1.registrationId + " - " + s1.name
                + " - " + s1.attendancePercentage + "%");

        System.out.println(s2.registrationId + " - " + s2.name
                + " - " + s2.attendancePercentage + "%");

        scanner.close();
    }
}