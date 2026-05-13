package com.sandeep.d_oops_and_datastructures;

import java.beans.ConstructorProperties;

public class ArrayListS <T> {
    private final int def_size ;
    private Object[] arr; //Initialize arr in constructor (best practice)
    private int size = 0;

    public boolean add(T e){
        this.ensureCapacity();
        arr[size] = e;
        size++;
        return true;
    }
    public boolean add(int i, T e) {
        this.ensureCapacity();
        for (int j = size; j > i; j--) {
            this.arr[j] = arr[j-1];
        }
        this.arr[i] = e;
        size++;
        return true;
    }
    private void ensureCapacity(){  //@Helper
        if (size == arr.length){
            Object[] newArr = new Object[2*size];
            for (int i = 0; i < size; i++){
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }
    }

    public boolean remove(int i){
        for (int j = i; j < size-1; j++){
            this.arr[j] = this.arr[j+1];
        }
        this.arr[size-1] = null;
        size--;
        return true;
    }

    public T get(int i){
        return (T) this.arr[i];
    }
    public int size(){
        return this.size;
    }
    public boolean contains(T e){
        for (int i = 0; i < size; i++){
            if (arr[i].equals(e)) return true;
        }
        return false;
    }

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

    //@Constructors
    public ArrayListS(){ //default Constructor
        this.def_size = 10;
        this.arr = new Object[def_size];
    }
    public ArrayListS(int l){//paramaterized Constructor
        this.def_size = l;
        this.arr = new Object[def_size];
    }
    public ArrayListS (ArrayListS<? extends T> list){
        this(list.size);

        for(int i = 0; i < list.size(); i++){ // here also i want help
            this.add(list.get(i)); //here i want help
        }
        //here I can use for-each look---> for that I have to make these "ArrayListS"==>Iterable
    }

}
