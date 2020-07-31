import javafx.application.Application;
import javafx.stage.Stage;

public class Bridge extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GameGui gameGui = new GameGui();
        gameGui.drawGui(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
