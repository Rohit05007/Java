import java.util.Scanner;

public class chapter_5_v21_types_of_loops {
    public static void main(String[] args) {
        // types of loops
        // (1) While loop
        // (2)do -while loop
        // (3) For loop
        // ---------------------
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        // we are print this number using loops
        // (1) While loop Example
        System.out.println("While loop !");
        int i = 1;
        while (i <= 3) {
            System.out.println(i); // first condition check than run
            i++;
        }

        // (2)do -while loop example
        System.out.println("do-While loop !");
        int a = 0;
        do {
            System.out.println(a); // First run than condition check
            a++;
        } while (a < 5);

        // (3) For loop example
        System.out.println("For loop !");
        for (int b = 1; b <= 10; b++) {
            System.out.println(b);
        }
        // Print first odd number
        for (int c = 0; c <= 5; c++) {
            System.out.println(2 * c + 1);
        }

    }
}