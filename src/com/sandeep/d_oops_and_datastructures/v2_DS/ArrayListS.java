package com.sandeep.d_oops_and_datastructures.v2_DS;
/*
    These is version 2.0 of ArrayListS
Here we gonna extend ListS and implement it
*/

import java.util.Iterator;

public class ArrayListS<T> implements ListS <T>{

    //These Class's concrete Members
    private final int def_size ;
    private Object[] arr; //Initialize arr in constructor (best practice)
    private int size = 0;

    //These are implementations of Collection's
    @Override
    public boolean add(T e){
        this.ensureCapacity();
        arr[size] = e;
        size++;
        return true;
    }
    @Override
    public boolean addAll(CollectionS<? extends T> c) {
        Iterator<?> cur = c.iterator();

        while (cur.hasNext()) this.add((T) cur.next());

        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++){
            if (this.arr[i].equals(o)) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object e){
        for (int i = 0; i < size; i++){
            if (arr[i].equals(e)) return true;
        }
        return false;
    }
    @Override
    public int size(){
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public void clear() {
        this.arr = new Object[this.def_size];
        size = 0;
    }

    //Feature- Iteration
    @Override
    public Iterator<T> iterator() {
        return new ArrayListSIterator();
    }

    private class ArrayListSIterator implements Iterator <T>{
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }
        @Override
        public T next() {
            if (hasNext()) return (T) arr[cursor++];
            else return null;
        }
    }



    //These are implemetations of ListS : INDEXBASED
    @Override
    public boolean add(int i, T e) {
        this.ensureCapacity();
        for (int j = size; j > i; j--) {
            this.arr[j] = arr[j-1];
        }
        this.arr[i] = e;
        size++;
        return true;
    }
    @Override
    public boolean remove(int i){
        for (int j = i; j < size-1; j++){
            this.arr[j] = this.arr[j+1];
        }
        this.arr[size-1] = null;
        size--;
        return true;
    }
    @Override
    public boolean set(int i, T e) {
        this.arr[i] = e;
        return true;
    }
    @Override
    public T get(int i){
        return (T) this.arr[i];
    }






    //@Constructors
    public ArrayListS(){ //default Constructor
        this.def_size = 10;
        this.arr = new Object[def_size];
    }
    public ArrayListS(int l){//paramaterized Constructor
        this.def_size = l;
        this.arr = new Object[def_size];
    }
    public ArrayListS(CollectionS<? extends T> list){
        this(list.size());

        /*for(int i = 0; i < list.size(); i++){ // here also i want help
            this.add(list.get(i)); //here i want help
        }*/
        //here I can use for-each look---> for that I have to make these "ArrayListS"==>Iterable

        for (T e : list){
            this.add(e);
        }
    }






    //@HelperFunctions
    private void ensureCapacity(){  //@Helper
        if (size == arr.length){
            Object[] newArr = new Object[2*size];
            for (int i = 0; i < size; i++){
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }
    }



    //These is overiding Object class's - logical comparision
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof ArrayListS<?>)) return false; //obj of different type , Hence can't compared

        ArrayListS<?> list2 = (ArrayListS<?>) obj;
        if (this.size() != list2.size) return false;

        for (int i = 0; i < this.size; i++){
            Object a = this.get(i);
            Object b = list2.get(i);

            //handle NullPointerException
            if (a == null && b == null) continue;
            if (a == null || b == null) return false;

            if (!a.equals(b)) return false;
        }

        return true;
    }

}
