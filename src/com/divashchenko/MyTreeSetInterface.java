package com.divashchenko;

public interface MyTreeSetInterface<T> {

    void add(T key);

    void clear();

    boolean isEmpty();

    boolean contains(T key);

    boolean remove(T key);

    int size();
    
}
