package david.greetings;

import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        String lowerCaseDesc = description.toLowerCase();
        String[] words = lowerCaseDesc.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals("uganda")) {
                count++;
            }
        }

        System.out.println("The word 'Uganda' appears " + count + " times.");
    }
}