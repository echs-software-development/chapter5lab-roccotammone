import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){

    //set up a scanner to take in the number of grades entered
    Scanner scan = new Scanner(System.in);

    System.out.println("How many grades do you have?");
    //create a count variable outside of the for loop
    int count = scan.nextInt();
    int sumOfGrades = 0;
  
    //create a for loop to iterate through the grades
    for(int i =1; i <= count; i++){
  
      //ask the user for the grades
      System.out.println("Enter a grade: ");
      int grade= scan.nextInt();
      sumOfGrades += grade;
        
    }
    System.out.println("The sum is: " + sumOfGrades);
  }
}