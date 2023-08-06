import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String Choice1 = "Rock";
        String Choice2 = "Paper";
        String Choice3 = "Scissors";

        System.out.println("Rock-Paper-Scissors Game Starts:");

        // Match
        int i;

        for (i = 0; i < 3; i++)
        {

            int rChoice = random.nextInt(3) + 1;
            String botChoice = "";

            if (rChoice == 1)
            {
                botChoice = Choice1;
            }
            else if (rChoice == 2)
            {
                botChoice = Choice2;
            }
            else if (rChoice == 3)
            {
                botChoice = Choice3;
            }

            String pChoice = scanner.nextLine();
            int p_Choice = 0;

            if (pChoice.equals("Rock"))
            {
                p_Choice = 1;
            } else if (pChoice.equals("Paper"))
            {
                p_Choice = 2;
            } else if (pChoice.equals("Scissors"))
            {
                p_Choice = 3;
            }

            System.out.println("Bot: " + botChoice);

            if (p_Choice > rChoice)
            {
                System.out.println("The player won the " + (i + 1) + "st round");
            }
            else if (p_Choice < rChoice)
            {
                System.out.println("The Bot won the " + (i + 1) + "st round");
            }
            else
            {
                System.out.println("The " + (i + 1) + "st round is a draw");
            }


        }

    }
}