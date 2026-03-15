public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] executeSort(int[] arr) {
        var newArr = arr.clone();
        sortStrategy.sort(newArr);
        return newArr;
    }
}
