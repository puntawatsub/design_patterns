import map.CityMap;
import map.Map;
import map.WildernessMap;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Map map = createMap();
        map.createTile();
        map.display();
    }

    public static Map createMap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("City or Wilderness? (C or W): ");
        String result = sc.nextLine();
        if (result.equalsIgnoreCase("c")) {
            return new CityMap();
        } else if (result.equalsIgnoreCase("w")) {
            return new WildernessMap();
        } else {
            throw new RuntimeException("Unable to get map type");
        }
    }
}
