package org.aapsasha.Decorator.Decorators;

public class ReadFromFile extends IFileStream{
    private String fileName;
    public ReadFromFile(String fileName){
        this.fileName = fileName;
    }
    @Override
    public String toString(){
        return "read from file " + fileName;
    }
}
