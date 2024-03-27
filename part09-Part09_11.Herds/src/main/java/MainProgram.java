
public class MainProgram {

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));

        herd.addToHerd(new Organism(19, 107));
        herd.move(3, 4);
        System.out.println(herd);
    }
}
