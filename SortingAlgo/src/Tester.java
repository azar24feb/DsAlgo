import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] arr = new int[] {4,8,2,4,29,14,56,32,88,56};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(arr)));
        System.out.println("Hello World!");
    }
}
