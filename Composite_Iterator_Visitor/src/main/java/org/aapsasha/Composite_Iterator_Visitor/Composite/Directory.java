package org.aapsasha.Composite_Iterator_Visitor.Composite;

import org.aapsasha.Composite_Iterator_Visitor.Iterators.FilesIterator;
import org.aapsasha.Composite_Iterator_Visitor.Visitor.IVisitor;

import java.util.ArrayList;

public class Directory extends Component{
    public ArrayList<Component> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }


    public void add(Component component){
        children.add(component);
        component.parent = this;
    }

    @Override
    public void show() {
        System.out.println("directory \"" + name + "\"");
        children.forEach(c -> c.show(1));
    }

    @Override
    protected void show(int tub) {
        for(int i =0; i < tub; ++i){
            System.out.print("\t");
        }
        System.out.println("directory \"" + name + "\"");
        children.forEach(c -> c.show(tub + 1));
    }

    public FilesIterator createIterator(){
        return new FilesIterator(this);
    }
    @Override
    public void doSomething(IVisitor visitor){
        visitor.execute(this);
    }
}
