package map;

import tile.*;

public class WildernessMap extends Map {

    public WildernessMap() {}

    @Override
    public Tile createTile() {
        double randomResult = Math.floor(Math.random() * 3);
        if (randomResult == 0) {
            return new SwampTile();
        } else if (randomResult == 1) {
            return new WaterTile();
        } else if (randomResult == 2) {
            return new ForestTile();
        } else {
            throw new RuntimeException("Random number out of scope");
        }
    }
}
