// this is  Rock Paper Scissor game come 
import java.util.Scanner;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {
        // 0 = Rock, 1 = Paper, 2 = Scissors
        String[] options = { "Rock", "Paper", "Scissor" };
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); 
        int userScore = 0;
        int computerScore = 0;
        System.out.println("0 For Rock, 1 For Paper, 2 For Scissors");
        System.out.println("total 5 rounds ! ");
        for (int round = 1; round <= 5; round++) {
            System.out.println("This is round " + round);
            System.out.print("Enter your choice from this( 0/1/2) : ");
            int userChoice = sc.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("you enter invalid choice !");
                continue;
            }
            int computerChoice = random.nextInt(3);
            System.out.println("your choice :" + options[userChoice]);
            System.out.println("Computer choice : " + options[computerChoice]);
            switch (userChoice) {
                case 0: // Rock
                    if (computerChoice == 0) {
                        System.out.println("It's a Tie! ");
                    } else if (computerChoice == 1) {
                        System.out.println("You Win!");
                        userScore++;
                    } else {
                        System.out.println("You Lose!");
                        computerScore++;
                    }
                    break;
                case 1: // Paper
                    if (computerChoice == 1) {
                        System.out.println("It's a Tie! ");
                    } else if (computerChoice == 0) {
                        System.out.println("You Win!");
                        userScore++;
                    } else {
                        System.out.println("You Lose!");
                        computerScore++;
                    }
                    break;
                case 2: // Scissor
                    if (computerChoice == 2) {
                        System.out.println("It's a Tie! ");
                    } else if (computerChoice == 1) {
                        System.out.println("You Win!");
                        userScore++;
                    } else {
                        System.out.println("You Lose!");
                        computerScore++;
                    }
                    break;
            }
        }
        System.out.println("----Game Over----- !");
        System.out.println("Your Score :" + userScore);
        System.out.println("computer Score: " + computerScore);

        if (userScore > computerScore) {
            System.out.println(" You won the game!");
        } else if (userScore < computerScore) {
            System.out.println(" You lost the game.");
        } else {
            System.out.println(" It's a tie!");
        }
    }

}
