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
        myTree.put(1, "Kate");
        myTree.put(14, "Mike");

        System.out.println("Size: " + myTree.size());
        System.out.println();
        System.out.println(myTree);
        System.out.println();

        System.out.println("Get value by key 12: " + myTree.get(12));
        System.out.println();

        System.out.println("Contains key 14? " + myTree.containsKey(14));
        System.out.println("Contains key 144? " + myTree.containsKey(144));
        System.out.println();

        System.out.println("Contains value Ben? " + myTree.containsValue("Ben"));
        System.out.println("Contains value Jul? " + myTree.containsValue("Jul"));
        System.out.println();

        System.out.println("Clear!");
        myTree.clear();
        System.out.println("Size: " + myTree.size());

    }
}
