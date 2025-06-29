import java.util.Scanner;
class input_user{
    public static void main(String[]args){
        System.out.println("Enter the values ");
     Scanner sc= new  Scanner(System.in);
     System.out.print("Enter the first value : ");
 int a =sc.nextInt();
System.out.print("Enter the second value :");
int b=sc.nextInt();
int sum=a+b;
System.out .printf("this is the sum of two number %d ",sum);

    }
}