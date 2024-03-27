
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");

            int age = Integer.valueOf(scanner.nextLine());

            list.add(new Book(input, age));
        }

        System.out.println(list.size() + " books in total.");

        System.out.println("Books:");

      //  list.stream().forEach(arg -> System.out.println(arg.getName() + " (recommended for " + arg.getAge() + " or older)"));
//        list.stream()
//                .sorted((p1, p2) -> 
//                        p1.getAge()
//                .compareTo(p2.getAge()));

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(list, comparator);
        
        for (Book item : list) {
            System.out.println(item.getName() + " (recommended for " + item.getAge() + " or older)");
        }
    }

}
