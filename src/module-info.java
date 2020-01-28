module FolkDanceSimulator {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    opens FolkDanceSimulator;
    opens FolkDanceSimulator.FXMLControllers to javafx.fxml;
    requires javafx.media;
}