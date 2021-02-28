package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UyelerController {

    //ANA PENCERE OGELERİ
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

    //EKLEME PENCERESİ OGELERİ
    @FXML
    private TextField txtUyeNo;

    @FXML
    private TextField txtAdi;

    @FXML
    private TextField txtSoyadi;

    @FXML
    private RadioButton radioErkek;

    @FXML
    private RadioButton radioKiz;

    @FXML
    private TextField txtAdresNo;

    @FXML
    private TextField txtTelefonNo;

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtUyeNoGuncelle;

    @FXML
    private TextField txtAdiGuncelle;

    @FXML
    private TextField txtSoyadiGuncelle;

    @FXML
    private RadioButton radioErkekGuncelle;

    @FXML
    private RadioButton radioKizGuncelle;

    @FXML
    private TextField txtAdresNoGuncelle;

    @FXML
    private TextField txtTelefonNoGuncelle;


}
