package com.LibrariyManagamentLogin.model;

public class DataSource {
    private static DataSource instance;

    private DataSource(){ };

    private static DataSource getInstance(){
        return instance;
    }


}
