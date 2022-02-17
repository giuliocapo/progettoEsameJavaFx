package com.example.progettoesamejavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    public void createAmmo1(){
        WeaponFact.getInstance().createAWeapon("9","black","20");
    }

    public static void main(String[] args) {
        launch();
    }
}