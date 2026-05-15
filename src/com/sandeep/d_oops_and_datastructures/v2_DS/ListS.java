package com.sandeep.d_oops_and_datastructures.v2_DS;

import java.util.Iterator;

public interface ListS<T> extends CollectionS<T> {

    @Override
    boolean add(T e);
    @Override
    boolean addAll(CollectionS<? extends T> c);

    @Override
    boolean remove(Object o);

    @Override
    boolean contains(Object o);
    @Override
    int size();
    @Override
    boolean isEmpty();

    @Override
    void clear();

    @Override
    Iterator<T> iterator();


    boolean add(int i, T e);
    boolean remove (int i);

    boolean set(int i, T e);
    T get(int i);
}
