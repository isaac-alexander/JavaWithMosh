import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // For Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        //While Loops
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // Do... While Loops
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // Break and Continue
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
                System.out.println(input);
        }

    }
}
