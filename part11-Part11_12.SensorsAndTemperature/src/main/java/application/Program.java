package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(4));
        ka.addSensor(new StandardSensor(5));
        ka.addSensor(new StandardSensor(9));
        ka.read();

    }

}
