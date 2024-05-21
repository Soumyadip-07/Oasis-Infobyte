import java.util.Scanner;
import java.util.Random;
class task_02
{
    
    static void game()
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number= random.nextInt(100)+1;
        int x=10;
        for(int i=1;i<=x;i++)
        {
            System.out.print("guess the number= ");
            int n= sc.nextInt();
            if(n<=100)
            {
                if(n>number)
                {
                    System.out.println("You're wrong... guess lower");
                }
                else if(n<number)
                {
                    System.out.println("You're wrong... guess higher");
                }
                else
                {
                    System.out.println("Congratulations! You guessed the correct number!");
                    System.out.println("You have tried "+i+" times to guess the correct number.");
                    break;
                }
                if((x-i)==0)
                {
                    System.out.println("Sorry \nYou failed to guess the correct number within 10 attempts.");
                    System.out.println("You have no attempts left.");
                    break;
                }
                else
                {
                    System.out.println("You have "+(x-i)+" attempts left");
                }
            }
            else
            {
                System.out.println("Invalid Input...");
                System.out.println("Please enter a valid Input...");
                System.out.println("You have "+(x-i)+" attempts left");
            }
        }
    }
    static void again()
    {
        System.out.print("Do you want to play again? (Yes/No)= ");
        Scanner sc1=new Scanner(System.in);
        String a= sc1.next();
        a= a.toLowerCase();
        if(a.equals("yes"))
        {
            game();
        }
        else if(a.equals("no"))
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Input...");
            again();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("**GUSSING THE NUMBER**");
        System.out.println("You have 10 attempts to guess number between 1 to 100");
        while(true)
        {
            System.out.println("Lets Start...");
            game();
            again();
        }
    }
}
