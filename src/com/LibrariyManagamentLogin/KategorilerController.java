package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class KategorilerController {

    //ANA PENCERE ÖGELERİ
    @FXML
    private AnchorPane kategoriPencere;

    @FXML
    private TextField kategoriAra;

    @FXML
    private ChoiceBox<?> kategoriAramaSecenekleri;

    @FXML
    void kategoriEkleBtn(ActionEvent event) {

    }

    @FXML
    void kategoriGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void kategoriSilBtn(ActionEvent event) {
        Stage stage = (Stage) kategoriPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Kategori Silindi.");
        alert.showAndWait();
    }

    //EKLEME PENCERESİ ÖGELERİ
    @FXML
    private TextField txtKategoriAdi;

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtKategoriAdiGuncelle;

}
