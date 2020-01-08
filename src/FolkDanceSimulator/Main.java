package FolkDanceSimulator;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    Scene menuScene;
    Pane menuPane;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Folk Dance Simulator 2020");

        //Generate menu
        menuPane = new Pane();
        menuScene = new Scene(menuPane, 800, 600);
        primaryStage.setScene(menuScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}