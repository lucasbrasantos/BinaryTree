package com.lucas;

public class Node {

    private int value;
    private Node left;
    private Node right;
    private Boolean isRoot;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Boolean getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void PrintNode() {
        System.out.println("ROOT: " + isRoot);
        System.out.println("Value: " + value);
        System.out.println("Left: " + (left != null ? left.getValue() : "null"));
        System.out.println("Right: " + (right != null ? right.getValue() : "null"));
        System.out.println("------------------");
    }

    public void printTree(String prefix, boolean isLeft) {
        if (this.right != null) {
            this.right.printTree(prefix + (isLeft ? "│   " : "    "), false);
        }

        if (this.isRoot != null) {
            System.out.println(prefix + (isLeft ? "└> " : "┌> ") + "[" +this.value + "]");
        }else{
            System.out.println(prefix + (isLeft ? "└── " : "┌── ") + this.value);
        }

        if (this.left != null) {
            this.left.printTree(prefix + (isLeft ? "    " : "│   "), true);
        }
    }


}
