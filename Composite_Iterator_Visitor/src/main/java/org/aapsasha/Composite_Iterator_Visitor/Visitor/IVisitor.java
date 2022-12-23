package org.aapsasha.Composite_Iterator_Visitor.Visitor;

import org.aapsasha.Composite_Iterator_Visitor.Composite.Component;
import org.aapsasha.Composite_Iterator_Visitor.Composite.Directory;
import org.aapsasha.Composite_Iterator_Visitor.Composite.myFile;

public abstract class IVisitor {
    public abstract void execute(Directory dir);
    public void execute(Component component){}
    public abstract void execute(myFile file);
}
