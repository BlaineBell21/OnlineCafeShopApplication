package com.cafeapp.utils;

import java.util.List;

public class ListUtils {

    public static <T> void printList(List<T> items){
        for (T item : items){
            System.out.println(item);
        }
    }
}
