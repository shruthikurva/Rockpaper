
import java.util.Scanner;
import java.util.Random;
public class Rockpaper {

    public static void main(String[] args) {
        final int ROCK=1;
        final int PAPER=2;
        final int SCISSORS=3;
         Scanner scanner=new Scanner(System.in);
         Random random=new Random();
         System.out.println("choose your move:");
         System.out.println("1-Rock");
         System.out.println("2-Paper");
         System.out.println("3-Scissors");
         int userChoice=scanner.nextInt();
         int computerChoice=random.nextInt(3)+1;
         System.out.println("computer chose:"+getchoiceName (computerChoice));
         if(userChoice==computerChoice){
            System.out.println("Its a tie!");
         }else if((userChoice == ROCK && computerChoice == SCISSORS)||
                (userChoice == PAPER && computerChoice == ROCK)||
                (userChoice == SCISSORS && computerChoice == PAPER)){
                    System.out.println("you win!");
                }else{
                    System.out.println("computer wins!");
                }
                scanner.close();
                 }
public static String getchoiceName(int choice){
    switch (choice) {
        case 1:return"ROCK";
        case 2:return"paper";
        case 3:return"scissors";
        default:return"unknown";
    
    }
}
         }

 
