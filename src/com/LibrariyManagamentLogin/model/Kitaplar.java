package com.LibrariyManagamentLogin.model;

import javafx.scene.input.DataFormat;

public class Kitaplar {

    private String ISBN;
    private String kitapAdi;
    private DataFormat yayinTarihi;
    private int sSayisi;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public DataFormat getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(DataFormat yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public int getsSayisi() {
        return sSayisi;
    }

    public void setsSayisi(int sSayisi) {
        this.sSayisi = sSayisi;
    }
}
