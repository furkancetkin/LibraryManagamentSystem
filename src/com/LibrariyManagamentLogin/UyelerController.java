package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UyelerController {

    @FXML
    private AnchorPane uyelerPencere;

    @FXML
    private TextField uyeAra;

    @FXML
    private ChoiceBox<?> uyeAramaSecenekleri;

    @FXML
    void uyeEkleBtn(ActionEvent event) {

    }

    @FXML
    void uyeGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void uyeSilBtn(ActionEvent event) {
        Stage stage = (Stage) uyelerPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Üye Silindi.");
        alert.showAndWait();
    }


}
