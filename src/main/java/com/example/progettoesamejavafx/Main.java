package com.example.progettoesamejavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 480);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void createLegendaryWeapon(){
       WeaponFact.getInstance().createAWeapon("max","max","gold");

    }

    @FXML
    public void createRareWeapon(){
        WeaponFact.getInstance().createAWeapon("medium","medium","purple");

    }

    @FXML
    public void createNormalWeapon(){
        WeaponFact.getInstance().createAWeapon("low","low","grey");
        ;
    }

    public static void main(String[] args) {
        launch();
    }
}