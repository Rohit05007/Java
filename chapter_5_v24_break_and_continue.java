import java.util.Scanner;

public class chapter_5_v24_break_and_continue {
    public static void main(String[] args) {
        // Break Statement
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }

        // continue Statement
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is great");
        }
    }
}
