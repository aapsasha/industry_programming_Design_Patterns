package org.aapsasha.Decorator.Decorators;

public class Decrypt extends Decorator{
    private CRYPTMETHODS method;
    public Decrypt(CRYPTMETHODS method,IFileStream stream) {
        super(stream);
        this.method = method;
    }
    @Override
    public String toString(){
        return super.stream.toString() + ", decrypted(" + method.toString() + ")";
    }
}
