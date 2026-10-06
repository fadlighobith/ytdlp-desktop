package com.ytdlp.ytdlpdesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML private VBox sidebar;

    @FXML private ImageView navLogo;

    @FXML private Button navDownloadButton;
    @FXML private Button navDirectoryButton;
    @FXML private Button navVideoInfoButton;
    @FXML private Button navAboutButton;
    @FXML private Button navExitButton;
    private List<Button> navButtons;

    @FXML private ScrollPane pageDownload;

    public void initialize() {
        sidebar.setPrefWidth(155);

        navLogo.setFitWidth(120);
        navLogo.setFitHeight(64);

        navButtons = new ArrayList<>();
        navButtons.add(navDownloadButton);
        navButtons.add(navDirectoryButton);
        navButtons.add(navVideoInfoButton);
        navButtons.add(navAboutButton);
        navButtons.add(navExitButton);

        pageDownload.setPrefWidth(345);
    }

    public void setupStage(Stage stage) {
        stage.maximizedProperty().addListener((obs, oldValue, maximized) -> {
            if (maximized) {
                sidebar.setPrefWidth(300);

                navLogo.setFitWidth(160);
                navLogo.setFitHeight(78);

                for (Button btn : navButtons) {
                    btn.setPrefWidth(240);
                    btn.setPrefHeight(40);
                    btn.setStyle(
                            "-fx-font-size: 14px;"
                    );
                }
            } else {
                sidebar.setPrefWidth(155);

                navLogo.setFitWidth(120);
                navLogo.setFitHeight(64);

                for (Button btn : navButtons) {
                    btn.setPrefWidth(116);
                    btn.setPrefHeight(32);
                    btn.setStyle(
                            "-fx-font-size: 12px;"
                    );
                }

                pageDownload.setPrefWidth(345);
            }
        });
    }
}
