package src.ss1;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Instantiate Scanner
        System.out.print("Enter your name: "); 
        String name = scanner.nextLine();          // Read user input
        System.out.println("Hello: " + name);      // Print greeting
    }
}
