package com.LibrariyManagamentLogin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

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

    }
}
