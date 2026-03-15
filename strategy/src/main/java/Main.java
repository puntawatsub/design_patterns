public class Main {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        int[] arrSmall = RandomArrayGenerator.generateRandomArray(30, 100000);
        int[] arrayBig = RandomArrayGenerator.generateRandomArray(100000, 100000);
        int[] result;
        SortContext sortContext = new SortContext(new SelectionSort());
        System.out.println("---- Selection Sort ----");
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrSmall);
        endTime = System.currentTimeMillis();
        System.out.printf("Small Array: %d ms%n", endTime - startTime);
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrayBig);
        endTime = System.currentTimeMillis();
        System.out.printf("Big Array: %d ms%n", endTime - startTime);

        System.out.println("---- Quick Sort ----");
        sortContext.setSortStrategy(new QuickSort());
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrSmall);
        endTime = System.currentTimeMillis();
        System.out.printf("Small Array: %d ms%n", endTime - startTime);
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrayBig);
        endTime = System.currentTimeMillis();
        System.out.printf("Big Array: %d ms%n", endTime - startTime);

        System.out.println("---- Heap Sort ----");
        sortContext.setSortStrategy(new HeapSort());
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrSmall);
        endTime = System.currentTimeMillis();
        System.out.printf("Small Array: %d ms%n", endTime - startTime);
        startTime = System.currentTimeMillis();
        sortContext.executeSort(arrayBig);
        endTime = System.currentTimeMillis();
        System.out.printf("Big Array: %d ms%n", endTime - startTime);
    }
}
