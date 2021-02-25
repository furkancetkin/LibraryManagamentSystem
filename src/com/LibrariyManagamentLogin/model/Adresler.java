package com.LibrariyManagamentLogin.model;

public class Adresler {

    private int adresNo;
    private int binaNo;
    private  String cadde;
    private  String mahalle;
    private  String sehir;
    private  String postaKodu;
    private  String ulke;

    public int getAdresNo() {
        return adresNo;
    }

    public void setAdresNo(int adresNo) {
        this.adresNo = adresNo;
    }

    public int getBinaNo() {
        return binaNo;
    }

    public void setBinaNo(int binaNo) {
        this.binaNo = binaNo;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
}
