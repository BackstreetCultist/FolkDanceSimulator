package FolkDanceSimulator.FXMLControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MenuController {
    @FXML
    private Label lblTitle;

    @FXML
    private ImageView imgSplash;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnQuit;

    @FXML
    private void closeApp(ActionEvent event){
        System.out.println("Simulator out");
        System.exit(0);
    }
}
