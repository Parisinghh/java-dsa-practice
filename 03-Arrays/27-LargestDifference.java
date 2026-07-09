public class LargestDifference {

    public static void main(String[] args) {
        int[] arr = {10, 3, 25, 7, 18};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int difference = max - min;

        System.out.println("Largest Difference: " + difference);
    }
}
