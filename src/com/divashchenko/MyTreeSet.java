package com.divashchenko;

public class MyTreeSet<T> implements MyTreeSetInterface<T> {
    private MyTreeMap map = new MyTreeMap();

    @Override
    public void add(T key) {
        map.put(key, null);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.size() == 0;
    }

    @Override
    public boolean contains(T key) {
        return map.containsKey(key);
    }

    @Override
    public void remove(T key) {
        map.remove(key);
    }

    @Override
    public int size() {
        return map.size();
    }
}
