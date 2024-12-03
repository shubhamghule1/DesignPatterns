package com.shubham.structural.adapter;

import java.util.List;

public interface ListAdapter<T> {
    public String convertToString();
    public List<T> convertToList();
}
