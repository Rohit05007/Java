import java.util.Scanner;

class practice_Q1 {
    public static void main(String[] args) {
/* Question 1 Writw a java program which asks the user to enter his name and greets them with
     "hello <name >,have a good day "text ---------------------*/
        System.out.print("Enter the name :");
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("Hello "+name+" have a good day !");
// Question 2 WAP of java to convert kilometers to miles------------------------
System.out.print("Enter the number to convert kilometers in miles :");
Scanner sc = new Scanner(System.in);
float kilometers =sc.nextFloat();
float miles= kilometers * 0.6213712f ;
System.out.println("miles :"+miles);
    }
}
