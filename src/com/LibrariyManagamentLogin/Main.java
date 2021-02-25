package com.LibrariyManagamentLogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {

        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("AIBU Kütüphanesi");
        primaryStage.setScene(new Scene(root, 875, 538));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
