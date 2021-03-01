import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
    //set up a scanner to obtain ints from the user
     Scanner scan = new Scanner(System.in);
     int pos= 0;
     int neg= 0;
     int count= 0, total=0, number;

     System.out.println("Enter an integer, the input ends if it is a 0: ");
     int num= scan.nextInt();
     while(num %10 != 0){
       if (num > 0){
         pos++;
       }
       else if (num < 0){
         neg++;
       }
       total += num;
       count++;
       num = scan.nextInt();
      }
     if (count==0)
       System.out.println("No numbers entered except 0");
      
     else {
        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is "+ neg);
        System.out.println("The total is "+ total);
        System.out.println("The average is " + total*1.0 / count);
      }
     

  }
}