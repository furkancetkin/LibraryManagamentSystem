package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class KitaplarController {

    //ANA PENCERE OGELERİ
    @FXML
    private AnchorPane kitaplarPencere;

    @FXML
    private TextField kitapAra;

    @FXML
    private ChoiceBox<?> aramaSecenekleri;

    public void initialize(URL url, ResourceBundle resourceBundle){}


    @FXML
    public void kitapEkleBtn(ActionEvent event) throws IOException {
        /*Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(yoneticiPencere.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("kitapEkleDialog.fxml"));
        dialog.setTitle("Yeni Kitap Ekle");
        dialog.getDialogPane().setContent(fxmlLoader.load());
        dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> sonuc = dialog.showAndWait();

        if (sonuc.get() == ButtonType.APPLY){
            System.out.println("tıklandı");
        }*/
    }

    @FXML
    void kitapGuncelleBtn(ActionEvent event) {

    }

    @FXML
    void kitapSilBtn(ActionEvent event) {
        Stage stage = (Stage) kitaplarPencere.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setHeaderText("Kitap Silindi.");
        alert.showAndWait();
    }

    //EKLEME PENCERESİ ÖGELERİ
    @FXML
    private TextField txtBarkodNo;

    @FXML
    private TextField txtKitapAdi;

    @FXML
    private TextField txtSayfaSayisi;

    @FXML
    private DatePicker dateYayinTarihi;

    @FXML
    private ImageView imageview;

    @FXML
    void btnKitapKapagi(ActionEvent event) {

    }

    //GÜNCELLE PENCERESİ ÖGELERİ
    @FXML
    private TextField txtBarkodNoGuncelle;

    @FXML
    private TextField txtKitapAdiGuncelle;

    @FXML
    private TextField txtSayfaSayisiGuncelle;

    @FXML
    private DatePicker dateYayinTarihiGuncelle;

    @FXML
    private ImageView imageviewGuncelle;

    @FXML
    void btnKitapKapagiGuncelle(ActionEvent event) {

    }


}
