package at.bas.projects.dataGenerator;

public class Main {
    public static void main(String[] args) {
        int[] data1 = DataGenerator.generateArray(10);
        int[] data2 = DataGenerator.generateArrayInRange(8, 0, 100);
        DataGenerator.printArray(data2);
    }
}