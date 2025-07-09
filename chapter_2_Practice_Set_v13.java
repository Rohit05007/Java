import java.util.Scanner;

class chapter_2_Practice_Set_v13{
    public static void main(String[] args) {
        // Problem 1
        String name = "ROHIT";
        System.out.println(name.toLowerCase());

        // Problem 2
        String text = "Hi My Name Rohit";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
       String letter="Dear Rohit , Thanks a lot";
       System.out.println(letter);
       letter=letter.replace("Rohit", "Rohan");
       System.out.println(letter);

//Problem 4
String mystring="This string contains  double and   triple spaces";
 System.out.println(mystring.indexOf("  "));//;If this give postive value this mean in this string positive value present .
System.out.println(mystring.indexOf("   "));// If this give postive value this mean in this string positive value present .
System.out.println(mystring.indexOf("    "));//If this give negitive value this mean in this string four space not present.

//Problem 5
String myletter = " Dear ,\n\t This java course is nice.\n\tThank!";
System.out.println(myletter);







}
}