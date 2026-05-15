package com.sandeep.d_oops_and_datastructures.v2_DS;

import java.util.Iterator;

public interface CollectionS<T> extends Iterable<T> {
    boolean add(T e);
    boolean addAll(CollectionS<? extends T> c);

    boolean remove(Object o);

    boolean contains(Object o);
    int size();
    boolean isEmpty();

    void clear();

    Iterator<T> iterator();
}