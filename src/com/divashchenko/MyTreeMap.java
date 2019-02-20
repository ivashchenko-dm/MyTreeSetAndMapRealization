package com.divashchenko;

public class MyTreeMap<K, V> implements MyTreeMapInterface<K, V> {

    private class TreeNode implements Comparable{
        K key;
        V value;
        TreeNode left;
        TreeNode right;

        public TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    private int count;
    private TreeNode root;


    @Override
    public void clear() {
        root = null;
        count = 0;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {
        if (root == null) {
            root = new TreeNode(key, value);
        } else {
            TreeNode tmp = findNode(key, root);
            if (tmp != null) {
                tmp.value = value;
            } else {

            }
        }

        count++;
    }

    @Override
    public int size() {
        return count;
    }

    private TreeNode findNode(K key, TreeNode node) {
        if (node != null) {
            if (node.key.equals(key)) {
                return node;
            } else {
                TreeNode foundNode = findNode(key, node.left);
                if (foundNode == null) {
                    foundNode = findNode(key, node.right);
                }
                return foundNode;
            }
        } else {
            return null;
        }
    }

    private void addNode(K key, V value) {

    }


}
