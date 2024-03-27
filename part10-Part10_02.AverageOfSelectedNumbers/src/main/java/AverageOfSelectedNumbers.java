
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(input);

        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String input = scanner.nextLine();

        if (input.equals("n")) {
            double negativeAverage = numbers.stream().mapToInt(number -> Integer.valueOf(number)).filter(num -> num < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + negativeAverage);

        }
        if (input.equals("p")) {
            double positiveAverage = numbers.stream().mapToInt(number -> Integer.valueOf(number)).filter(num -> num > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + positiveAverage);

        }

    }
}
