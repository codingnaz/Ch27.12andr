package com.example.saimon22.ch2712;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by SAimon22 on 12/3/2017.
 */
public class methodTest {
    @Test
    public void setToList() throws Exception {

        Set<Integer> mySet = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            mySet.add(MainActivity.newRam());
        }
        ArrayList<Integer> list = method.setToList(mySet);
        Assert.assertTrue(mySet.toString().equals(list.toString()));
    }
}