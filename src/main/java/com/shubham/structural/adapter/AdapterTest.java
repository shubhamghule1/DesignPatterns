package com.shubham.structural.adapter;

import java.util.List;

public class AdapterTest {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5};
        ArrayAdaptee<Integer> adaptee = new ArrayAdaptee<>(numbers);
        ListAdapter<Integer> listAdapter = new ArrayToListAdapter<>(adaptee);
        System.out.println(listAdapter.convertToString());
        List<Integer> list = listAdapter.convertToList();
        System.out.println(list.getClass().getName());


        String [] alphabets = {"abc", "def", "ghi", "jkl", "mno"};
        ArrayAdaptee<String> listAdaptee = new ArrayAdaptee<>(alphabets);
        ListAdapter<String> alphabetListAdapter = new ArrayToListAdapter<>(listAdaptee);
        System.out.println(alphabetListAdapter.convertToString());
        List<String> list2 = alphabetListAdapter.convertToList();
        System.out.println(list2.getClass().getName());
    }
}
