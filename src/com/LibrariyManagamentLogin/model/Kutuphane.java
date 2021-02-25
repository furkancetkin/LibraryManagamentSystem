package com.LibrariyManagamentLogin.model;

public class Kutuphane {

    private int kutuphaneNo;
    private int adresNo;
    private String kutuphaneIsmi;
    private String aciklama;

    public int getKutuphaneNo() {
        return kutuphaneNo;
    }

    public void setKutuphaneNo(int kutuphaneNo) {
        this.kutuphaneNo = kutuphaneNo;
    }

    public int getAdresNo() {
        return adresNo;
    }

    public void setAdresNo(int adresNo) {
        this.adresNo = adresNo;
    }

    public String getKutuphaneIsmi() {
        return kutuphaneIsmi;
    }

    public void setKutuphaneIsmi(String kutuphaneIsmi) {
        this.kutuphaneIsmi = kutuphaneIsmi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
