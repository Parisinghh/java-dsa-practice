public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element exists");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }
}
