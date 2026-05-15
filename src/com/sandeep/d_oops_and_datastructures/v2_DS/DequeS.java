package com.sandeep.d_oops_and_datastructures.v2_DS;

import java.util.Iterator;

public interface DequeS<T> extends
        QueueS<T> {
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

    @Override
    boolean offer(T e);
    @Override
    T poll();
    @Override
    T peek();

    boolean addFirst(T e);
    boolean offerFirst(T e);
    boolean addLast(T e);
    boolean offerLast(T e);

    T removeFirst();
    T pollFirst();
    T removeLast();
    T pollLast();

    T getFirst();
    T peekFirst();
    T getLast();
    T peekLast();
}
