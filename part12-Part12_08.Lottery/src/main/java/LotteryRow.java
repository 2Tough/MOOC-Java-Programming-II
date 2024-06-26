
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        // Implement the random number generation here
        Random values = new Random();
        // the method containsNumber is probably useful

        while (this.numbers.size() < 7) {
            int randomNum = values.nextInt(40) + 1;
            if (!containsNumber(randomNum)) {
                this.numbers.add(randomNum);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (Integer values : this.numbers) {
            if (values == number) {
                return true;

            }
        }

        return false;
    }
}
