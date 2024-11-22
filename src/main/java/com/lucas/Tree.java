package com.lucas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tree {

    private Node root;
    private List<Node> nodeList;

    private int[] values;

    public Tree(int[] values) {
        this.root = null;
        this.nodeList = new ArrayList<>();
        this.values = values;
        Arrays.sort(values);

        this.root = init(values, 0, values.length - 1);
        this.root.setIsRoot(true);
    }

    private Node init(int[] values, int start, int end) {

        if (start > end) {
            return null;
        }

        // values = {1, 2, 3, 4, 5, 6, 7}
        // index  = {0, 1, 2, 3, 4, 5, 6}
        // For start=0 and end=6, mid=(0+6)/2=3. So, values[3] = 4 is the root

        int mid = (start + end) / 2;
        Node node = new Node(values[mid]);

        node.setLeft(init(values, start, mid - 1));
        node.setRight(init(values, mid + 1, end));
        nodeList.add(node);

        return node;
    }

    public void printNodes() {
        for (Node node : nodeList) {
            node.PrintNode();
        }
    }

    public void printTree() {
        if (root != null) {
            root.printTree("", true);
        } else {
            System.out.println("The tree is empty.");
        }
    }

}