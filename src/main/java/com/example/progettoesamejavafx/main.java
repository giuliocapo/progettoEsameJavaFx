package com.example.progettoesamejavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 620);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void createLegendaryWeapon(){
        WeaponFact.getInstance().createAWeapon("max","max","gold");
        System.out.println("arma leggendaria creata!");
    }

    public static void main(String[] args) {
        launch();
    }
}