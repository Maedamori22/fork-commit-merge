// Java - Easy
import java.util.Scanner;

public class GreetingApp {

    public static void main(String[] args) {
        // TODO: Implement a Simple Greeting Applicationa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + name + "! Nice to meet you!");

    }
}
