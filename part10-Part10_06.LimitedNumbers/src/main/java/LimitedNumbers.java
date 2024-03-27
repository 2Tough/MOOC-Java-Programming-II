
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        
        while (true) {
            int input = scanner.nextInt();
            
            if (input == - 1) {
                break;
            }
            
            numbers.add(input);
        }
        
        numbers.stream().filter(value -> value >= 0 && value <= 5).forEach(num -> System.out.println(num));

    }
}
