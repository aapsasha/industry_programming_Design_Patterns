package org.aapsasha.Decorator;

import org.aapsasha.Decorator.Decorators.*;

public class Main {
    public static void main(String[] args) throws Exception {
        IFileStream stream = new Dearchive(ARCHIVINGMETHODS.ZIP,new Dearchive(ARCHIVINGMETHODS.RAR, new Decrypt(CRYPTMETHODS.DIGITALSIGNATURE, new ReadFromFile("input.txt"))));
        System.out.println(stream);
    }
}
