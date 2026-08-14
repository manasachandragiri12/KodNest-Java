import java.util.Scanner;

// ---------- StudentApp class (main / menu driver) ----------
public class StudentApp {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student student = new Student();

        // Local variable
        int choice = 0;

        // Initial banner
        System.out.println("============================");
        System.out.println("   STUDENT PRACTICE TRACKER");
        System.out.println("============================");

        // Step 9: Accept initial student details
        System.out.println("\nEnter Student Name:");
        String name = sc.nextLine();

        System.out.println("\nEnter Course Name:");
        String courseName = sc.nextLine();

        System.out.println("\nEnter Completed Topics:");
        int completedTopics = sc.nextInt();

        System.out.println("\nEnter Questions Solved:");
        int questionsSolved = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Call the appropriate methods to store the values
        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        // Step 11: while loop - keep showing the menu until user selects 5 (Exit)
        while (choice != 5) {

            // Step 10: Display the main menu
            System.out.println("\n============================");
            System.out.println("           MENU");
            System.out.println("============================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                // Step 12
                student.displayDetails();

            } else if (choice == 2) {
                // Step 13
                student.displayProgress();

            } else if (choice == 3) {
                // Step 14
                System.out.println("How many new topics did you complete?");
                System.out.print("Enter New Completed Topics: ");
                int newTopics = sc.nextInt();
                student.addTopics(newTopics);

            } else if (choice == 4) {
                // Step 15
                System.out.println("How many new questions did you solve?");
                System.out.print("Enter New Questions Solved: ");
                int newQuestions = sc.nextInt();
                student.addQuestions(newQuestions);

            } else if (choice == 5) {
                // Step 16
                System.out.println("Thank you for using Student Practice Tracker.");
                System.out.println("Keep Practicing!");
                // Stop the loop (choice == 5 ends the while condition)

            } else {
                // Step 17: Handle invalid menu choice
                System.out.println("Invalid choice.");
                System.out.println("Please enter a value between 1 and 5.");
            }
        }

        sc.close();
    }
}