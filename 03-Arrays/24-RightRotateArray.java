public class RightRotateArray {

    public static void rightRotate(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return;
        }

        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rightRotate(arr);

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
