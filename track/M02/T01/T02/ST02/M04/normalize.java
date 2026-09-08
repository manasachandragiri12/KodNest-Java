package M04;

import java.util.Scanner;

public class normalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        String normaltext = sentence.trim().toLowerCase();
        String text = keyword.trim().toLowerCase();
        System.out.println("Normalized text: " + normaltext);
        System.out.println("Contains keyword: " + normaltext.contains(text));
    }
}