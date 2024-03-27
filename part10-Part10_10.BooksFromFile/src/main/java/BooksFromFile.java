
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        List<Book> list = new ArrayList();
        
        try {
            Files.lines(Paths.get(file))
                .map(value -> value.split(","))
                .filter(parts -> parts.length >= 4)            
                .map(element -> new Book(element[0], 
                    Integer.valueOf(element[1]), 
                    Integer.valueOf(element[2]), 
                    element[3]))
            .forEach(book -> list.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

}
