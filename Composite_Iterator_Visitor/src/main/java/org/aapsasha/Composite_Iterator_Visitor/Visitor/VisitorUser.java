package org.aapsasha.Composite_Iterator_Visitor.Visitor;

import org.aapsasha.Composite_Iterator_Visitor.Composite.Component;
import org.aapsasha.Composite_Iterator_Visitor.Composite.Directory;
import org.aapsasha.Composite_Iterator_Visitor.Composite.myFile;

public class VisitorUser extends IVisitor{
    @Override
    public void execute(Directory dir) {
        System.out.println("directory " + dir.name + " can not be executed");
    }


    @Override
    public void execute(myFile file) {
        System.out.println("file " + file.name +  " executed");
    }
}
