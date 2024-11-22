package com.lucas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int[] values2 = {5, 11, 12, 14, 15, 18, 19, 21, 23, 25, 27, 28, 30, 32, 37};
        int[] randomValues = new int[20];

        Random random = new Random();
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextInt(100);
        }

//        Tree mainTree = new Tree(randomValues);
        Tree mainTree = new Tree(values2);
        mainTree.printTree();
    }
}