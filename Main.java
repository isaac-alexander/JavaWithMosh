import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();
        System.out.println(now);

        // Reference type
        Point point1 = new Point(1, 1);
        Point point2 =  point1;
        point1.x = 2;
        System.out.println(point2);

        // String
      String message = "  Hello World  " + "!!";

      System.out.println(message.startsWith("!!"));
      System.out.println(message.endsWith("!!"));
      System.out.println(message.indexOf("H"));
      System.out.println(message.replace("!", "*"));
      System.out.println(message.toLowerCase());
      System.out.println(message.trim());

      // Escape Sequence \ \n(new line)  \t (tab)
      String text = "Hello \"Alex\"";
      System.out.println(text);

      // Array
        int[] numbers = { 2, 3, 5, 1, 4 };
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Multi-Dimensional Array
        int [][] numbers2 = { { 1, 2, 3}, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers2)); // deepToString for printing Multi-Dimensional Arr

        // Constant
        final float PI = 3.14F; // ones initialised with the final keywords makes a variable constant, it cannot be changed later on


    }
}
