package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AdreslerController {

    //ANA PENCERE ÖGELERİ
    @FXML
    private AnchorPane adreslerPencere;

    @FXML
    private TextField adresAra;

    @FXML
    private ChoiceBox<?> adresAramaSecenekleri;

    @FXML
    void adresEkleBtn(ActionEvent event) {

    }

    @FXML
    void adresGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void adresSilBtn(ActionEvent event) {
        Stage stage = (Stage) adreslerPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Adres Silindi.");
        alert.showAndWait();
    }

    //EKLEME PENCERESİ ÖGELERİ
    @FXML
    private TextField txtAdresNo;

    @FXML
    private TextField txtBinaNo;

    @FXML
    private TextField txtCadde;

    @FXML
    private TextField txtMahalle;

    @FXML
    private TextField txtSehir;

    @FXML
    private TextField txtPostaKodu;

    @FXML
    private TextField txtUlke;

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtAdresNoGuncelle;

    @FXML
    private TextField txtBinaNoGuncelle;

    @FXML
    private TextField txtCaddeGuncelle;

    @FXML
    private TextField txtMahalleGuncelle;

    @FXML
    private TextField txtSehirGuncelle;

    @FXML
    private TextField txtPostaKoduGuncelle;

    @FXML
    private TextField txtUlkeGuncelle;


}
