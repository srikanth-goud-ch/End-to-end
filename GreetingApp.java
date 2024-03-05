import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input
        String name = scanner.nextLine();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to the Greeting Application.");
    }
}

