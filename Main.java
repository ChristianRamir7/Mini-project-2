import java.util.Scanner;

import javax.lang.model.util.ElementScanner7;

class Main {
  public static void main(String[] args) {
   System.out.println("Hello and welcome to christian's Trivia game");
   
    System.out.println("we will be asking a series of questions and if you get them right you will recive a point");
   
    System.out.println("If you get it wrong you will lose a point");
   
   System.out.println("Are you ready say yes or no");
    
    Scanner scan = new Scanner(System.in);
    System.out.println( "Answer true or false?");
    boolean answer = scan.nextBoolean();
    
  
    if (answer)
    {
      System.out.println("Ok first question...");
    }
    else 
    {
    System.out.println("Have a nice day...");
    } 
  }  
}