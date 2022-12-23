package org.aapsasha.Singleton;

public class Main {
    public static void main(String[] args) throws Exception {
        IDBConnectionSingleton connection1 = IDBConnectionSingleton.getInstance();
        IDBConnectionSingleton connection2 = IDBConnectionSingleton.getInstance();
        System.out.println(connection1);
        System.out.println(connection2);
    }
}
