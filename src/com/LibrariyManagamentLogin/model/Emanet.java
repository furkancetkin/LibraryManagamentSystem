package com.LibrariyManagamentLogin.model;

import javafx.scene.input.DataFormat;

public class Emanet {

    private int emanetNo;
    private String isbn;
    private int uyeNo;
    private int kutuphaneNo;
    private DataFormat emantetTarihi;
    private DataFormat teslimTarihi;

    public int getEmanetNo() {
        return emanetNo;
    }

    public void setEmanetNo(int emanetNo) {
        this.emanetNo = emanetNo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    public int getKutuphaneNo() {
        return kutuphaneNo;
    }

    public void setKutuphaneNo(int kutuphaneNo) {
        this.kutuphaneNo = kutuphaneNo;
    }

    public DataFormat getEmantetTarihi() {
        return emantetTarihi;
    }

    public void setEmantetTarihi(DataFormat emantetTarihi) {
        this.emantetTarihi = emantetTarihi;
    }

    public DataFormat getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(DataFormat teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }
}
