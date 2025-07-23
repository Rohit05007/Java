import java.util.Scanner;

class chapter_4_practice_set_v19 {
    public static void main(String[] args) {
        // Question (1)----------------------------------------------------------------------

        int a = 10;
        if (a == 11) {
            System.out.println("i am 11");
        } else {
            System.out.println("I am not 11");
        }

        // Question (2)----------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1 subect marks : ");
        float m1 = sc.nextFloat();
        System.out.print("Enter your  2 subect marks : ");
        float m2 = sc.nextFloat();
        System.out.print("Enter your 3 subect marks : ");
        float m3 = sc.nextFloat();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Overall percentage is " + avg);
        if (avg >= 40 && m1 >= 33 && m3 >= 33) {
            System.out.println("Congratulation , You have been promoted ");
        } else {
            System.out.println("Sorry, You have not been promoted !");
        }
        if (m1 < 33 || m2 < 33 || m3 < 33) {
            System.out.println("Reason: Marks in at least one subject are less than 33.");
        }
        if (avg < 40) {
            System.out.println("Reason: Overall average is less than 40.");
        }

        // Question (3)----------------------------------------------------------------------

        System.out.print("Enter you annual income : ");
        float income = sc.nextFloat();
        if (income <= 250000) {
            System.out.println("your are not give any tax in your income !");
            System.out.println("your income is : " + income);
        } else if (income > 250000 && income <= 500000) {
            float taxincome = (income * 5) / 100;
            float afttax = income - taxincome;
            System.out.println("tax to be paid : " + taxincome);
            System.out.println("Your income after 5% tax : " + afttax);
        } else if (income > 500000 && income <= 1000000) {
            float taxincome = (income * 20) / 100;
            float afttax = income - taxincome;
            System.out.println("tax to be paid : " + taxincome);
            System.out.println("Your income after 20% tax :" + afttax);
        } else if (income > 1000000) {
            float taxincome = (income * 30) / 100;
            float afttax = income - taxincome;
            System.out.println("tax to be paid : " + taxincome);
            System.out.println("Your income after 30% tax :" + afttax);
        }

        // Question (4)----------------------------------------------------------------------

        System.out.print("Enter day number :");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number !");
                break;
        }

        // Question (5)----------------------------------------------------------------------

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Question (6)

        System.out.print("Enter the Website :");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an Organizational website ");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an Commercial website ");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website ");
        }

    }
}