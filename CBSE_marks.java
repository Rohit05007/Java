import java.util.Scanner;
class CBSE_marks{
    public static void main(String[]args){
        System.out.print("How many marks of paper :");
        Scanner sc=new Scanner(System.in);
          int total= sc.nextInt();
            System.out.print("Enter the total marks :");
        int num= sc.nextInt();
        if(total<num){
           System.out.print("invalid marks !");
        }
        else{
            int per=((num*100)/total);
            System.out.printf("this is the persentage of marks : %d",per);
            
        }
    }
}