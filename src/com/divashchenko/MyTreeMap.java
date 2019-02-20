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
        checkKey(key);
        return findNode(new TreeNode(key, null), root) != null;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V get(K key) {
        checkKey(key);

        TreeNode node = findNode(new TreeNode(key, null), root);
        if (node != null) {
            return node.value;
        } else {
            return null;
        }
    }

    @Override
    public void put(K key, V value) {
/*        try {
            checkKey(key);
        } catch (IllegalAccessException e) {
            System.out.println("Wrong Key!");
            return;
        }*/

        checkKey(key);
        if (root == null) {
            root = new TreeNode(key, value);
        } else {
            TreeNode tmp = findNode(new TreeNode(key, value), root);
            if (tmp != null) {
                tmp.value = value;
            } else {
                addNode(new TreeNode(key, value), root);
            }
        }

        count++;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void remove() {

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
        if (node.compareTo(root) < 0) {
            if (root.left == null)  {
                root.left = node;
            } else {
                addNode(root.left, node);
            }
        } else if (node.compareTo(root) > 0) {
            if (root.right == null)  {
                root.right = node;
            } else {
                addNode(root.right, node);
            }
        }
    }

    private void checkKey(K key) {
        if (!(key instanceof Comparable)) {
            try {
                throw new IllegalAccessException("Wrong key!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
