public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        
        moveZeros(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    static void moveZeros(int[] arr) {
        int insertPos = 0;
        
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos] = num;
                insertPos++;
            }
        }
        
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}
