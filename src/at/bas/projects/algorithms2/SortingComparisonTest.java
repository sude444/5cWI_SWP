package projects.algorithms2;

import java.util.Random;
import java.util.Arrays;

public class SortingComparisonTest {

    public static void main(String[] args) {
        // Array-Größen definieren
        int[] sizes = { 10000, 100000, 400000 };

        for (int size : sizes) {
            // Zufälliges Array erstellen
            int[] originalArray = generateRandomArray(size);

            System.out.println("Sorting array of size: " + size);

            // Bubble Sort
            int[] bubbleArray = originalArray.clone();
            long bubbleStart = System.nanoTime();
            bubbleSort(bubbleArray);
            long bubbleEnd = System.nanoTime();
            double bubbleTime = (bubbleEnd - bubbleStart) / 1e9;
            System.out.println("Bubble Sort Time: " + bub bleTime + " seconds");

            // Selection Sort
            int[] selectionArray = originalArray.clone();
            long selectionStart = System.nanoTime();
            selectionSort(selectionArray);
            long selectionEnd = System.nanoTime();
            double selectionTime = (selectionEnd - selectionStart) / 1e9;
            System.out.println("Selection Sort Time: " + selectionTime + " seconds");

            // Insertion Sort
            int[] insertionArray = originalArray.clone();
            long insertionStart = System.nanoTime();
            insertionSort(insertionArray);
            long insertionEnd = System.nanoTime();
            double insertionTime = (insertionEnd - insertionStart) / 1e9;
            System.out.println("Insertion Sort Time: " + insertionTime + " seconds");

            // Quick Sort
            int[] quickArray = originalArray.clone();
            long quickStart = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            long quickEnd = System.nanoTime();
            double quickTime = (quickEnd - quickStart) / 1e9;
            System.out.println("Quick Sort Time: " + quickTime + " seconds");

            // Schnellster Algorithmus bestimmen
            if (bubbleTime <= selectionTime && bubbleTime <= insertionTime && bubbleTime <= quickTime) {
                System.out.println("Fastest: Bubble Sort\n");
            } else if (selectionTime <= bubbleTime && selectionTime <= insertionTime && selectionTime <= quickTime) {
                System.out.println("Fastest: Selection Sort\n");
            } else if (insertionTime <= bubbleTime && insertionTime <= selectionTime && insertionTime <= quickTime) {
                System.out.println("Fastest: Insertion Sort\n");
            } else {
                System.out.println("Fastest: Quick Sort\n");
            }
        }
    }

    // Methode zum Erstellen eines Arrays mit zufälligen Zahlen
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    // Bubble Sort Algorithmus
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    // Selection Sort Algorithmus
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort Algorithmus
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Quick Sort Algorithmus
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
