package org.aapsasha.Composite_Iterator_Visitor.Iterators;

import org.aapsasha.Composite_Iterator_Visitor.Composite.Component;

public abstract class Iterator {
    public abstract boolean hasMore();
    public abstract void move() throws Exception;
    public abstract Object get();

}
