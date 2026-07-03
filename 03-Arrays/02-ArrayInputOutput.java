import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
