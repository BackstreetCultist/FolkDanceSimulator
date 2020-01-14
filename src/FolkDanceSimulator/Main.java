package FolkDanceSimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("FXMLSource/Menu.fxml"));

        Scene menuScene = new Scene(root, 600, 400);

        primaryStage.setTitle("Folk Dance Simulator 2020");
        primaryStage.setScene(menuScene);
        primaryStage.show();
}

    public static void main(String[] args) {
        launch(args);
    }
}