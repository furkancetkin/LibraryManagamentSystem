package com.LibrariyManagamentLogin.model;

import java.sql.Connection;
import java.sql.Statement;

public class DataSource {
    private static DataSource instance;

    private DataSource(){ };

    private static DataSource getInstance(){
        return instance;
    }

    public static final String DB_NAME = "kutuphane";
    public static final String driver="com.mysql.cj.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost/kutuphane";
    public static final String user="root";
    public static final String password="1234";


    //TABLOLAR
    //ADRSLER
    public static final String TABLE_ADRESLER="album";
    public static final String SUTUN_ADRES_NO="adres_no";
    public static final String SUTUN_BINA_NO="bina_no";
    public static final String SUTUN_CADDE="cadde";
    public static final String SUTUN_MAHALLE="mahalle";
    public static final String SUTUN_SEHIR="sehir";
    public static final String SUTUN_POSTA_KODU="posta_kodu";
    public static final String SUTUN_ULKE="ulke";

    //EMANET
    public static final String TABLE_EMANET="emanet";
    public static final String SUTUN_EMANET_NO="emanet_no";
    public static final String SUTUN_EMANET_ISBN="isbn";
    public static final String SUTUN_EMANTE_UYE_NO="uye_no";
    public static final String SUTUN_EMANET_KUTUPHANE_NO="kutuphane_no";
    public static final String SUTUN_EMANET_TARIHI="emanet_tarihi";
    public static final String SUTUN_TESLIM_TARIHI="teslim_tarihi";

    //KATEGORİLER
    public static final String TABLE_KATEGORILER="kategoriler";
    public static final String SUTUN_KATEGORI_ADI="kategori_adi";

    //KITAPLAR
    public static final String TABLE_KITAPLAR="kitaplar";
    public static final String SUTUN_KITAPLAR_ISBN="isbn";
    public static final String SUTUN_KITAP_ADI="kitap_adi";
    public static final String SUTUN_YAYIN_TARIHI="yayin_tarihi";
    public static final String SUTUN_SAYFA_SAYISI="sayfa_sayisi";

    //KUTUPHANE
    public static final String TABLE_KUTUPHANE="kutuphane";
    public static final String SUTUN_KUTUPHANE_NO="kutuphane_no";
    public static final String SUTUN_KUTUPHANE_ADRES_NO="adres_no";
    public static final String SUTUN_ACIKLAMA="aciklama";

    //UYELER
    public static final String TABLE_UYELER="uyeler";
    public static final String SUTUN_UYE_NO="uye_no";
    public static final String SUTUN_UYE_ADI="uye_adi";
    public static final String SUTUN_UYE_SOYADI="uye_soyadi";
    public static final String SUTUN_CINSIYET="cinsiyet";
    public static final String SUTUN_UYELER_ADRES_NO="adres_no";
    public static final String SUTUN_TELEFON="telefon";

    //YAZARLAR
    public static final String TABLE_YAZARLAR="yazarlar";
    public static final String SUTUN_YAZAR_ADI="yazar_adi";
    public static final String SUTUN_YAZAR_SOYADI="yazar_soyadi";


    public static final int SIRALA_ARTAN=1;
    public static final int SIRALA_AZALAN=2;


    private Connection connection = null ;
    private Statement statement = null;


}
