package com.example.saimon22.ch2712;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by SAimon22 on 12/3/2017.
 */
public class method {
    public static <E> ArrayList<E> setToList(Set<E> s) {

        ArrayList<E> list = new ArrayList<>();

        for (E e: s) {
            list.add(e);
        }

        return list;
    }
}
