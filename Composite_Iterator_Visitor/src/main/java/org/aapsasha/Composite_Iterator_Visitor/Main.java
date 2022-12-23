package org.aapsasha.Composite_Iterator_Visitor;

import org.aapsasha.Composite_Iterator_Visitor.Composite.Directory;
import org.aapsasha.Composite_Iterator_Visitor.Composite.myFile;
import org.aapsasha.Composite_Iterator_Visitor.Iterators.FilesIterator;
import org.aapsasha.Composite_Iterator_Visitor.Visitor.IVisitor;
import org.aapsasha.Composite_Iterator_Visitor.Visitor.VisitorUser;

public class Main {
    public static void main(String[] args) throws Exception {
        Directory root = new Directory("root");
        Directory importantData = new Directory("Data");
        importantData.add(new myFile("presentation.pdf"));
        importantData.add(new myFile("passwords.txt"));
        importantData.add(new myFile("my photo.pdf"));
        root.add(importantData);
        Directory programmfiles  =new Directory("programm files");
        programmfiles.add(new myFile("log.txt"));
        programmfiles.add(new myFile("source file.cpp"));
        root.add(programmfiles);
        root.add(new myFile("some unimportant staff.txt"));
        root.show();
        FilesIterator it = root.createIterator();
        IVisitor visitor = new VisitorUser();
        it.get().doSomething(visitor);
        it.move();
        it.get().doSomething(visitor);
        it.move();
        it.move();
        it.get().doSomething(visitor);
        it.move();
        it.move();
        it.get().doSomething(visitor);
    }
}
