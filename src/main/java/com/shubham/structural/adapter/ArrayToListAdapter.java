package com.shubham.structural.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListAdapter<T> implements ListAdapter<T>{
    private ArrayAdaptee<T> arrayAdaptee;

    public ArrayToListAdapter(ArrayAdaptee<T> arrayAdaptee) {
        this.arrayAdaptee = arrayAdaptee;
    }

    @Override
    public String convertToString() {
        return Arrays.toString(arrayAdaptee.getElements());
    }

    @Override
    public List<T> convertToList() {
        return Arrays.asList(arrayAdaptee.getElements());
    }
}
