package com.lucas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int[] randomValues = new int[20];

        Random random = new Random();
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextInt(100);
        }

        Tree mainTree = new Tree(randomValues);
//        Tree mainTree = new Tree(values);
        mainTree.printTree();
    }
}