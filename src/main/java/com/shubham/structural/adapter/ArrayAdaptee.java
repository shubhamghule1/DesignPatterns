package com.shubham.structural.adapter;

public class ArrayAdaptee<T> {
    private T [] numbers;

    public ArrayAdaptee(T [] numbers) {
        this.numbers = numbers;
    }

    public T[] getElements() {
        return numbers;
    }
}
