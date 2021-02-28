package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EmanetController {

    @FXML
    private AnchorPane emanetPencere;

    @FXML
    private TextField emanetAra;

    @FXML
    private ChoiceBox<?> emanetAramaSecenekleri;

    @FXML
    void teslimEdilenlerBtn(ActionEvent event) {

    }

    @FXML
    void teslimEtBtn(ActionEvent event) {

    }

    @FXML
    void emanetEkleBtn(ActionEvent event) {

    }

    @FXML
    void emanetGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void emanetSilBtn(ActionEvent event) {
        Stage stage = (Stage) emanetPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Emanet Silindi.");
        alert.showAndWait();
    }


    //EKLEME PENCERESİ ÖGELERİ
    @FXML
    private TextField txtEmanetNo;

    @FXML
    private TextField txtEmanetIsbnNo;

    @FXML
    private TextField txtEmanetUyeNo;

    @FXML
    private TextField txtEmanetKutuphaneNo;

    @FXML
    private DatePicker dateEmanetTarihi;

    @FXML
    private DatePicker dateEmanetTeslimTarihi;

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtEmanetNoGuncelle;

    @FXML
    private TextField txtEmanetIsbnNoGuncelle;

    @FXML
    private TextField txtEmanetUyeNoGuncelle;

    @FXML
    private TextField txtEmanetKutuphaneNoGuncelle;

    @FXML
    private DatePicker dateEmanetTarihiGuncelle;

    @FXML
    private DatePicker dateEmanetTeslimTarihiGuncelle;


}
