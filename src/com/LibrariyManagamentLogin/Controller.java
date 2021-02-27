package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginbtn;

    @FXML
    private Button manager;

    @FXML
    private Button student;

    @FXML
    private Pane academician;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*loginbtn.setOnAction(actionEvent -> {
            try {
                Parent rootNode = FXMLLoader.load(getClass().getResource("yonetici.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(rootNode);
                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });*/
    }
}
