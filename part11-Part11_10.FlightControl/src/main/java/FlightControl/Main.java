package FlightControl;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Scanner;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        

        
        FlightControl flightControl = new FlightControl();
        
        TextUI programm = new TextUI(flightControl, new Scanner(System.in));
        programm.start();
    }
}
