package org.aapsasha.Decorator.Decorators;

public class Dearchive extends Decorator{
    private ARCHIVINGMETHODS method;
    public Dearchive(ARCHIVINGMETHODS method, IFileStream stream) {
        super(stream);
        this.method = method;
    }
    @Override
    public String toString(){
        return super.stream.toString() + ", unarchived(" + method.toString() + ")";
    }
}
