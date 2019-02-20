package com.divashchenko;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        MyTreeMap<Integer, String> myTree = new MyTreeMap<>();

        myTree.put(5, "Alex");
        myTree.put(8, "Ben");
        myTree.put(2, "Carl");
        myTree.put(12, "Nancy");
        myTree.put(1, "Karl");
        myTree.put(14, "Mike");

        System.out.println(myTree.size());
        System.out.println();
        System.out.println(myTree);

    }
}
