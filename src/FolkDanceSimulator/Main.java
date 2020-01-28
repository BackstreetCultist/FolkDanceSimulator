package FolkDanceSimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    AnchorPane menuRoot;
    AnchorPane mainScreenRoot;
    Scene menuScene;
    Scene mainScreenScene;
    Stage programStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        programStage = primaryStage;
        menuRoot = FXMLLoader.load(getClass().getResource("FXMLSource/Menu.fxml"));
        mainScreenRoot = FXMLLoader.load(getClass().getResource("FXMLSource/MainScreen.fxml"));

        menuScene = new Scene(menuRoot, 600, 400);
        mainScreenScene = new Scene(mainScreenRoot, 600, 400);

        programStage.setTitle("Folk Dance Simulator 2020");
        programStage.setScene(menuScene);
        programStage.show();

        setScreen("Test string");
    }

    public void setScreen(String str){
        switch(str){
            case "Menu":
                programStage.setScene(menuScene);
                programStage.show();
                break;
            case "MainScreen":
                programStage.setScene(mainScreenScene);
                programStage.show();
                break;
            default:
                System.err.println("setScreen triggered with unknown string");
                programStage.setScene(menuScene);
                programStage.show();
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}