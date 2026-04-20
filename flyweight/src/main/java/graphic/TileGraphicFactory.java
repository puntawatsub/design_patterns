package graphic;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import tile.*;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static Map<Tile, Rectangle> tileRectangleMap = new HashMap<>();

    private static final int TILE_SIZE = 50;



    public static Rectangle getTileRectangle(Tile tile) {
        Rectangle rect = tileRectangleMap.get(tile);
        if (rect != null) {
            return rect;
        } else {
            rect = new Rectangle(TILE_SIZE, TILE_SIZE);
            if (tile instanceof WaterTile) {
                rect.setFill(Color.BLUE);
            } else if (tile instanceof ForestTile) {
                rect.setFill(Color.GREEN);
            } else if (tile instanceof BuildingTile) {
                rect.setFill(Color.GRAY);
            } else if (tile instanceof RoadTile) {
                rect.setFill(Color.BROWN);
            } else if (tile instanceof SwampTile) {
                rect.setFill(Color.DARKGREEN);
            }
            tileRectangleMap.put(tile, rect);
        }
        return rect;
    }
}
