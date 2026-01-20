package map;

import tile.Tile;

public abstract class Map {
    public Map() {}

    public abstract Tile createTile();
    public void display() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(createTile().getCharacter());
            }
            System.out.println();
        }

    }
}
