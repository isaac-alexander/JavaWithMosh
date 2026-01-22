public class ForEachLoops {
    public static void main(String[] args) {
        // For-Each Loop
        String[] fruits = { "Apple", "Mango", "Orange"};

        for (int index = 0; index < fruits.length; index++) {
            System.out.println(fruits[index]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
