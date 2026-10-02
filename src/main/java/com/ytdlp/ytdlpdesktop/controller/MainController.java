package com.ytdlp.ytdlpdesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private VBox sidebar;

    public void initialize() {
        sidebar.setPrefWidth(155);
    }

    public void setupStage(Stage stage) {
        stage.maximizedProperty().addListener((obs, oldValue, maximized) -> {
            sidebar.setPrefWidth(maximized ? 300 : 155);
        });
    }

    @FXML
    private Button toggleButton;

    private boolean expanded = false;

    @FXML
    private void toggleMaximized() {
        Stage stage = (Stage) sidebar.getScene().getWindow();
        boolean maximized = !stage.isMaximized();
        stage.setMaximized(maximized);
        sidebar.setPrefWidth(maximized ? 300 : 155);
    }
}
