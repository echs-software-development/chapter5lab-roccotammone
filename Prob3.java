import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args){
    //set up a scanner to enter the number of students the user wants to enter
    Scanner scan= new Scanner(System.in);

    System.out.println("How many students?: ");
    int student= scan.nextInt();

    //prompt the user to enter the user name
     System.out.println("Enter a username: ");
     String user= scan.next();
    //prompt the user for a score
     System.out.println("Enter a score: ");
     int score = scan.nextInt();
    //set up the for loop through the number of students -1    
    for(int i = 1; i<= student-1; i++){
      //prompt the user to enter the user name
      System.out.println("Enter a username: ");
      //prompt the user for a score
      String newUser= scan.next();
      System.out.println("Enter a score: ");
      int newScore = scan.nextInt();
      //use an if statement to compare the scores and see if one is greater than the other. 
      if (score< newScore){
        //Swap the variable to score 2
        score = newScore;
        //swap the variable to student 1
        user = newUser;
      }
      else {
        score = score;
      }
      }
      //print out the top score
    System.out.println(user + " had the highest score with " + score);

  }
}