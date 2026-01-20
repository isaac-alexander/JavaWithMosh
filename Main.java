import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
      System.out.println(Arrays.deepToString(numbers2)); // deepToString for printing Multi-Dimensional Array

      // Constant
     final float PI = 3.14F; // ones initialised with the final keywords makes a variable constant, it cannot be changed later on

      //Arithmetic Expressions
      int result = 10 + 3;
      System.out.println(result);

      double result2 = (double) 10 / (double) 3;
      System.out.println(result2);

      // Augmented assignment
      int x = 1;
      x += 2;
      System.out.println(x);

      // Order of operators
      int x2 = 10 + 3 * 2;
      System.out.println(x2); // 16
      int x3 = (10 + 3) * 2;
      System.out.println(x3); // 26

      // Casting
      // 1. Implicit or automatic casting/conversion
      // byte > short > int > long > float > double
      short a = 1;
      int b = x + 2;
      System.out.println(b);

      double c = 1.1;
      double d = c + 2;
      System.out.println(d);

      // 2. Explicit casting
      double e = 1.1;
      int f = (int)e + 2; // cast e to and integer
      System.out.println(e); // 3

      // String to integer
      String g = "1";
      int h  = Integer.parseInt(g) + 2;

      // String floating point to integer
      String i = "1.1";
      Double j  = Double.parseDouble(i) + 2;
      System.out.println(j);

      // The Math class
      int roundResult = Math.round(1.1F);
      System.out.println(roundResult);

      int ceilResult = (int)Math.ceil(1.1F);
      System.out.println(ceilResult);

      int floorResult = (int)Math.floor(1.1F);
      System.out.println(floorResult);

      int maxResult = Math.max(1, 2);
      System.out.println("prints max number : " + maxResult);

      double roundRandomResult = Math.round(Math.random() * 100);
      System.out.println("prints a random number : " + roundRandomResult);

      int  intRandomResult = (int) (Math.random() * 100);
      System.out.println("prints a whole number : " + intRandomResult); // rounds to a whole number

       // Formatting numbers
       String currencyResult = NumberFormat.getCurrencyInstance().format(1234567.891);
       System.out.println(currencyResult);

       String percentResult = NumberFormat.getPercentInstance().format(0.1);
       System.out.println(percentResult);

       // Reading inputs
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age2 = scanner.nextByte();
        System.out.println("You are " + age2);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner2.nextLine().trim();
        System.out.println("You are " + name);

    }
}
