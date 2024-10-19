import java.util.Random;
import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("             ====== NUMBER SYSTEM GAME ======           ");
        System.out.println(" ");
        System.out.println(" ");

        do{
            int attempts = 5;
            int numberToGuess = random.nextInt(100) + 1;
            // System.out.println(numberToGuess); TESTING PURPOSE
            boolean hasWon = false;
            System.out.println("round has started you have " + attempts + " to win.");
            for(int i = 0; i < attempts ; i++){
                System.out.println("enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess){
                    System.out.println("Congratulations! You've guessed the correct number.");
                    hasWon = true;
                    score += (attempts - i);
                    break;
                }
                else if(userGuess < numberToGuess){
                    System.out.println("Too low! Try again.");
                }
                else{
                    System.out.println("Too high! Try again.");
                }
                System.out.println("You have " + (attempts - i - 1) + " attempts remaining.");

            }
            if (!hasWon) {
                System.out.println("Sorry, you're out of attempts. The correct number was " + numberToGuess + ".");
            }
            System.out.print("\nWould you like to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        }while (playAgain);

        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
