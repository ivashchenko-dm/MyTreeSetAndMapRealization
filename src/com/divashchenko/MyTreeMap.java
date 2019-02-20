package com.divashchenko;

public class MyTreeMap<K, V> implements MyTreeMapInterface<K, V> {

    private class TreeNode implements Comparable<TreeNode>{
        K key;
        V value;
        TreeNode left;
        TreeNode right;

        public TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
        }


        @Override
        public int compareTo(TreeNode o) {
            return ((Comparable) key).compareTo(o.key);
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
            TreeNode tmp = findNode(new TreeNode(key, value), root);
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

    private TreeNode findNode(TreeNode node, TreeNode root) {
        if (root != null) {
            if (root.compareTo(node) == 0) {
                return root;
            } else {
                TreeNode foundNode = findNode(node, root.left);
                if (foundNode == null) {
                    foundNode = findNode(node, root.right);
                }
                return foundNode;
            }
        } else {
            return null;
        }
    }

    private void addNode(TreeNode root, TreeNode node) {

    }


}
