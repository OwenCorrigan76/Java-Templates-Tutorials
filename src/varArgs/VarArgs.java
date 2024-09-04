package varArgs;

public class VarArgs {
    public static void main(String[] args) {
        callArgs();
    }
    public static void callArgs() {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String item4 = "Pears22";
        printShoppingList(item1, item2, item3, item4);
        printShoppingList("Bread", "Milk", "Eggs");
        printShoppingList("Owen", "Gayle");
    }

    // we can overload the method with different amount of parameters
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }

//    private static void printShoppingList(String s1, String s2, String s3) {
//        System.out.println("SHOPPING LIST");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//    }
//
//    private static void printShoppingList1(String[] items) {
//        System.out.println("SHOPPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(i + 1 + ": " + items[i]);
//        }
//        System.out.println();
//    }
}
