package org.aapsasha.Composite_Iterator_Visitor.Composite;

import org.aapsasha.Composite_Iterator_Visitor.Visitor.IVisitor;

public abstract class Component {
    public String name;
    public Directory parent;
    public abstract void show();

    protected abstract void show(int tub);

    public void doSomething(IVisitor visitor){
        visitor.execute(this);
    }
    public Component(String name){
        this.name = name;
    }
}
