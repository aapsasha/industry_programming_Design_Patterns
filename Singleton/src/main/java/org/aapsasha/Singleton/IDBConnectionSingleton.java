package org.aapsasha.Singleton;

public class IDBConnectionSingleton {
    static IDBConnectionSingleton connection;
    private IDBConnectionSingleton(){
    }
    public static IDBConnectionSingleton getInstance(){
        if(connection == null){
            connection = new IDBConnectionSingleton();
        }
        return connection;
    }
}
