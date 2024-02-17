import Q2.*;
import java.util.*;

public class ShipDriver {
    public static void main(String[] args) {
        Ship ships[] = new Ship[3];

        Ship ship = new Ship("The Queen", "2087");
        Ship cruiseShip = new CruiseShip("The Knight", "7895", 50000);
        Ship cargoShip = new CargoShip("The King", "4512", 1000000);

        ships[0] = ship;
        ships[1] = cruiseShip;
        ships[2] = cargoShip;

        System.out.println();

        for (Ship selectedShip : ships) {
            System.out.println(selectedShip.toString());
            System.out.println();
        }
    }
}
