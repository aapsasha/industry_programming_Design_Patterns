package org.aapsasha.State.IDB;

public class DBConnection {
    IDBConnectionState state;
    public DBConnection(){
        state = new CloseState(this);
    }
    void changeState(IDBConnectionState state){
        this.state =state;
    }
    public void open(){
        state.open();
    }
    public void close(){ state.close();}
    public void process(){state.process();}

}
