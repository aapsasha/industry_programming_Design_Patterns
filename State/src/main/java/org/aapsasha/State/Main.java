package org.aapsasha.State;

import org.aapsasha.State.IDB.DBConnection;

public class Main {
    public static void main(String[] args){
        DBConnection SQLconnection = new DBConnection();
        SQLconnection.open();
        SQLconnection.process();
        SQLconnection.process();
        SQLconnection.open();
        SQLconnection.close();
        SQLconnection.process();
    }
}
