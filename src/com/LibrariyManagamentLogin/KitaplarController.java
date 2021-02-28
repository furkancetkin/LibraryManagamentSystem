package com.LibrariyManagamentLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class KitaplarController {

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

}
