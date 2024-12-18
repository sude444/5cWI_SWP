package algorithms;

import algorithms.algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        AlgorithmTest algorithmTest = new AlgorithmTest();
        algorithmTest.setAlgorithm(bubbleSort);

        int[] testData = { 0, -4, 4, 44, 444, -44, -444 };
        int[] newData = algorithmTest.testAlgorithm(testData);

        for (int i = 0; i < newData.length; i++) {
            System.out.println(newData[i]);
        }
    }
}