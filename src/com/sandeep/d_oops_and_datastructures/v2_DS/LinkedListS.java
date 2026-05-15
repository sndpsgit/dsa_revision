package com.sandeep.d_oops_and_datastructures.v2_DS;

import java.util.Iterator;

public class LinkedListS <T> implements
        ListS <T>, DequeS<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        T data;
        Node next;
        Node(T e){
            this.data = e;
        }
        Node(T e, Node next){
            this(e);
            this.next = next;
        }
    }



    //CollectionS Methods
    @Override
    public boolean add(T e) {
        Node node = new Node(e);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }
    @Override
    public boolean addAll(CollectionS<? extends T> c) {
        Iterator<?> it = c.iterator();
        while (it.hasNext()) this.add((T) it.next());
        return true;
    }
    @Override
    public boolean remove(Object o) {
        if (size == 0) return false;
        Node cur = head;
        if (cur.data.equals(o)) { //handles edge case for head onwards
            head = cur.next;
            if (tail.equals(cur)) tail = cur.next;
            size--;
            return true;
        }
        while (cur.next != null){ //works for all elements ahead of head
            if (cur.next.data.equals(o)) {
                cur.next = cur.next.next;
                size--;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    @Override
    public boolean contains(Object o) {
        Node cur = head;
        while (cur != null){
            if (cur.data.equals(o)) return true;
            cur = cur.next;
        }
        return false;
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public Iterator<T> iterator() {
        return new LinkedListSIterator();
    }
    private class LinkedListSIterator implements Iterator <T>{
        Node cur = head;
        @Override
        public boolean hasNext() {
            return cur != null;
        }
        @Override
        public T next() {
            T data = (cur == null) ? null : (T) cur.data;
            cur = cur.next;
            return data;
        }
    }


    //ListS methods
    @Override
    public boolean add(int i, T e) {
        if (i > size) return false;
        Node node = new Node(e);

        Node cur = head;
        for (int j = 0; j < i-1; j++) cur = cur.next;

        node.next = cur.next;
        cur.next = node;
        size++;
        return true;
    }
    @Override
    public T get(int i) {
        if (i >= size) return null;

        Node cur = head;
        for (int j = 0; j < i; j++) cur = cur.next;
        return cur.data;
    }
    @Override
    public boolean remove(int i) {
        if (i >= size) return false;

        Node cur = head;
        for (int j = 0; j < i-1; j++) cur = cur.next;

        cur.next = cur.next.next;
        size--;
        return true;
    }
    @Override
    public boolean set(int i, T e) {
        if (i >= size) return false;

        Node cur = head;
        for (int j = 0; j <= i; j++) cur = cur.next;
        cur.data = e;
        return true;
    }


    //QueueS methods
    @Override
    public boolean offer(T e) {
        return this.add(e);
    }
    @Override
    public T poll() {
        T data = this.get(0);
        this.remove(size-1);
        return data;
    }
    @Override
    public T peek() {
        return this.get(0);
    }

    //Deque methods
    @Override
    public boolean addFirst(T e) {
        return add(0, e);
    }
    @Override
    public boolean offerFirst(T e) {
        return add(0, e);
    }
    @Override
    public boolean addLast(T e) {
        return add(size-1, e);
    }
    @Override
    public boolean offerLast(T e) {
        return add(size-1, e);
    }
    @Override
    public T removeFirst() {
        return this.poll();
    }
    @Override
    public T pollFirst() {
        return this.poll();
    }
    @Override
    public T removeLast() {
        T data = this.get(size-1);
        this.remove(size-1);
        return data;
    }
    @Override
    public T pollLast() {
        T data = this.get(size-1);
        this.remove(size-1);
        return data;
    }
    @Override
    public T getFirst() {
        return this.get(0);
    }
    @Override
    public T peekFirst() {
        return this.get(0);
    }
    @Override
    public T getLast() {
        return this.get(size-1);
    }
    @Override
    public T peekLast() {
        return this.get(size-1);
    }

}
