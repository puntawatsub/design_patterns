package map;

import graphic.App;
import graphic.FX;
import javafx.application.Application;
import javafx.application.Platform;
import tile.Tile;

public abstract class Map {
    public Map() {}

    public abstract Tile createTile();
    public void display() {
        Tile[] tiles = new Tile[10*10];
        for (int x = 0; x < 10*10; x++) {
                tiles[x] = createTile();
        }
        FX.setTiles(tiles);
        Application.launch(App.class);
    }
}
