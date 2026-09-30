package com.ytdlp.ytdlpdesktop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/ytdlp/ytdlpdesktop/view/main.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 500, 350); // Minimize Size
        stage.setMaximized(true);

        stage.setScene(scene);
        stage.show();
    }
}
