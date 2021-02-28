package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class YazarlarController {

    //ANA PENCERE ÖGELERİ
    @FXML
    private AnchorPane yazarlarPencere;

    @FXML
    private TextField yazarAra;

    @FXML
    private ChoiceBox<?> yazarAramaSecenekleri;

    @FXML
    void yazarEkleBtn(ActionEvent event) {

    }

    @FXML
    void yazarGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void yazarSilBtn(ActionEvent event) {
        Stage stage = (Stage) yazarlarPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Yazar Silindi.");
        alert.showAndWait();
    }

    //EKLEME PENCERESİ OGELERİ
    @FXML
    private TextField txtYazarAdi;

    @FXML
    private TextField txtYazarSoyadi;

    //GÜNCELLE PENCERESİ OGELERİ
    @FXML
    private TextField txtYazarAdiGuncelle;

    @FXML
    private TextField txtYazarSoyadiGuncelle;

}
