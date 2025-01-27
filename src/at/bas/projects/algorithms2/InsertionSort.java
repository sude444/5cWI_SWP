package projects.algorithms2;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        // Array-Größen definieren
        int[] sizes = { 10000, 100000, 400000 };

        for (int size : sizes) {
            // Zufälliges Array erstellen
            int[] array = generateRandomArray(size);

            System.out.println("Sorting array of size: " + size);

            // Startzeit erfassen
            long startTime = System.currentTimeMillis();

            // Insertion Sort durchführen
            insertionSort(array);

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

    // Insertion Sort Algorithmus
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Elemente verschieben, die größer als der Schlüssel sind
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // Schlüssel an die richtige Position setzen
            array[j + 1] = key;
        }
    }
}
