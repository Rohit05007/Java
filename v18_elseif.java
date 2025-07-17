import java.util.Scanner;

class v18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if (age > 46) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi- semi-experienced!");
        } else {
            System.out.println("You are not experienced!");
        }
        System.out.print("Enter the age for job : ");
        int job = sc.nextInt();
        // switch statement
        switch (job) {
            case 18:
                System.out.println("You are going to become an Adult !");
                break;
            case 23:
                System.out.println("You are going to join a job !");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life ");
        }

    }
}