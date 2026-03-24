import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Member identification
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Member ID: ");
        String idNo = sc.nextLine();

        double totalSavings = 0;
        int months = 6;

        System.out.println("\n--- Monthly Contribution Input ---");
        
        for (int i = 1; i <= months; i++) {
            System.out.print("Enter contribution for Month " + i + ": ");
            
            try {
                // This is where the Critical Test occurs
                double contribution = sc.nextDouble();
                totalSavings += contribution;
            } catch (InputMismatchException e) {
                // Critical Test: Observe behavior when a string is assigned to a numeric input
                System.out.println("\n[SYSTEM ERROR]: Type Mismatch Detected.");
                System.out.println("Observation: Java's Static Typing prevented a String from being added to Total Savings.");
                System.out.println("The program will now terminate to protect data integrity.");
                return; // Exit the program
            }
        }

        // Final Summary
        System.out.println("\n--- SACCO FINANCIAL SUMMARY ---");
        System.out.println("Member Name: " + name);
        System.out.println("Member ID  : " + idNo);
        System.out.println("Total Accumulated Savings: KES " + totalSavings);

        sc.close();
    }
}
