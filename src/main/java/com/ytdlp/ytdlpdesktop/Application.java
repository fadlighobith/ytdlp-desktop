package com.ytdlp.ytdlpdesktop;

import com.ytdlp.ytdlpdesktop.controller.MainController;
import com.ytdlp.ytdlpdesktop.helpers.Links;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(Links.MAINVIEW));

        Scene scene = new Scene(fxmlLoader.load(), Links.WINDOW_WIDTH, Links.WINDOW_HEIGHT);

        MainController controller = fxmlLoader.getController();
        controller.setupStage(stage);

        stage.setScene(scene);
        stage.show();
    }
}
