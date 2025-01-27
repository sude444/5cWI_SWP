package projects.algorithms2;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        // Array-Größen definieren
        int[] sizes = { 10000, 100000, 400000 };

        for (int size : sizes) {
            // Zufälliges Array erstellen
            int[] array = generateRandomArray(size);

            System.out.println("Sorting array of size: " + size);

            // Startzeit erfassen
            long startTime = System.currentTimeMillis();

            // Bubble Sort durchführen
            bubbleSort(array);

            // Endzeit erfassen
            long endTime = System.currentTimeMillis();

            System.out.println("Time taken: " + (endTime - startTime) + " ms\n");
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
                    // Elemente tauschen
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // Nach jedem Durchgang wird das größte Element an die richtige Position
                 // gebracht
        } while (swapped);
    }
}
