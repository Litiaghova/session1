package com.arina.session1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFX extends Application {

    private static Scene scene;
    public static Stage s;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("loginScreen"), 800, 500);
        stage.setTitle("Окно входа");
        s = stage;
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public static Parent getRoot() {
        return scene.getRoot();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JavaFX.class.getResource(
                fxml + ".fxml"

        ));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
