import java.util.Scanner;

class v16_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age : ");
        int age = sc.nextInt();
        // if - else statement
        if (age > 18) {
            System.out.println("yes you can drive");
        } else {
            System.out.println("No you cannot drive yet !");
        }
        // Relational Operators : == , >= , <= , != ,< , >
        // example :-
        int num = 19;
        if (num != 18) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}