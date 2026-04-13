package graphic;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import tile.Tile;

public class FX {

    private static Tile[] tiles;

    private static final int TILE_SIZE = 50;
    private static final int MAP_SIZE = 10;
    public void render() {

        Stage stage = new Stage();

        GridPane grid = new GridPane();


        for (int row = 0; row < MAP_SIZE; row++) {
            for (int col = 0; col < MAP_SIZE; col++) {
                Rectangle rect = getRectangle(tiles, row, col);
                grid.add(rect, col, row);
            }
        }

        Scene scene = new Scene(grid, TILE_SIZE * MAP_SIZE, TILE_SIZE * MAP_SIZE);
        stage.setTitle("Tile Map");
        stage.setScene(scene);
        stage.show();
    }

    private Rectangle getRectangle(Tile[] tiles, int row, int col) {
        Tile tile = tiles[row * MAP_SIZE + col];
        return TileGraphicFactory.getTileRectangle(tile);
    }

    public static void setTiles(Tile[] t) {
        tiles = t;
    }
}
