import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
