package map;
import tile.BuildingTile;
import tile.ForestTile;
import tile.RoadTile;
import tile.Tile;

public class CityMap extends Map {
    public CityMap() {}

    @Override
    public Tile createTile() {
        double randomResult = Math.floor(Math.random() * 3);
        if (randomResult == 0) {
            return new BuildingTile();
        } else if (randomResult == 1) {
            return new RoadTile();
        } else if (randomResult == 2) {
            return new ForestTile();
        } else {
            throw new RuntimeException("Random number out of scope");
        }
    }
}
