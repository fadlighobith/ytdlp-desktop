module com.ytdlp.ytdlpdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;

    opens com.ytdlp.ytdlpdesktop to javafx.fxml;
    exports com.ytdlp.ytdlpdesktop;
    exports com.ytdlp.ytdlpdesktop.controller;
    opens com.ytdlp.ytdlpdesktop.controller to javafx.fxml;
}