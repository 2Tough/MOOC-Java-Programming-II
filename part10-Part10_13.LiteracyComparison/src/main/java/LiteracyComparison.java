
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(value -> value.split(","))
                    .sorted((p1, p2)-> p1[5].compareTo(p2[5]))
                    .forEach(arg -> System.out.println(arg[3] + " (" + arg[4] + "), " + arg[2].split(" ")[1] + ", " + arg[5]));
                        
                    ;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        

    }
}
