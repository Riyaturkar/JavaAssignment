package javaDemo;
import java.util.*;

public class Q6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input= scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count == 0) {
        	System.out.println("No numbers entered. Cannot calculate average and product.");
        } else {
            double average = sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }

        scanner.close();
        }

}
