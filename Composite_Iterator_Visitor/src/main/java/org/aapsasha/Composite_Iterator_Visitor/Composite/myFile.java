package org.aapsasha.Composite_Iterator_Visitor.Composite;

import org.aapsasha.Composite_Iterator_Visitor.Visitor.IVisitor;

public class myFile extends Component{
    public myFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("file \""  + name + "\"");
    }

    @Override
    public void show(int tub) {
        for(int i =0; i < tub; ++i){
            System.out.print("\t");
        }
        show();
    }
    @Override
    public void doSomething(IVisitor visitor){
        visitor.execute(this);
    }

}
