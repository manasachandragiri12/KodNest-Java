import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read learner details
        String firstName = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();

        // Display the profile
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        scanner.close();
    }
}