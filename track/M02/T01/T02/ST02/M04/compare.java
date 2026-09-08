package M04;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        // Compare the two values in both ways.
        boolean match = firstText.equals(secondText);
        boolean ignorematch = firstText.equalsIgnoreCase(secondText);
        System.out.println("Exact match: " + match);
        System.out.println("Ignore-case match: " + ignorematch);
        scanner.close();
    }

}
