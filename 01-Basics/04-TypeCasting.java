public class TypeCasting {
    public static void main(String[] args) {

         int num = 100;
        double decimal = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + decimal);

        double price = 99.99;
        int wholeNumber = (int) price;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + price);
        System.out.println("Integer value: " + wholeNumber);
    }
}
