package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class KutuphaneController {

    //ANA PENCERE ÖGELERİ
    @FXML
    private AnchorPane kutuphanePencere;

    @FXML
    private TextField kutuphaneAra;

    @FXML
    private ChoiceBox<?> kutuphaneAramaSecenekleri;

    @FXML
    void kutuphaneEkleBtn(ActionEvent event) {

    }

    @FXML
    void kutuphaneGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void kutuphaneSilBtn(ActionEvent event) {
        Stage stage = (Stage) kutuphanePencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Kütüphane Silindi.");
        alert.showAndWait();
    }

    //EKLEME PENCERESİ ÖGELERİ
    @FXML
    private TextField txtKutuphaneNo;

    @FXML
    private TextField txtKutuphaneAdresNo;

    @FXML
    private TextArea txtKutuphaneAciklama;

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtKutuphaneNoGuncelle;

    @FXML
    private TextField txtKutuphaneAdresNoGuncelle;

    @FXML
    private TextArea txtKutuphaneAciklamaGuncelle;


}
