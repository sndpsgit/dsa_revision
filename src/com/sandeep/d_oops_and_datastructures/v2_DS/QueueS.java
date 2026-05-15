package com.sandeep.d_oops_and_datastructures.v2_DS;

import java.util.Iterator;

public interface QueueS <T> extends
        CollectionS<T>{

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

    boolean offer(T e);
    T poll();
    T peek();
}
