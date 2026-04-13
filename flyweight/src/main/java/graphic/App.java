package graphic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import tile.*;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        var fx = new FX();
        fx.render();
    }
}
