import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.lang.model.util.ElementScanner7;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello and welcome to christian's Trivia game");

    System.out.println("We will be asking a series of questions and if you get them right you will recive a point");

    System.out.println("If you get it wrong you will lose a point");

    // ask user how many times the would like to play game
    // take in your response and save it to a variable named gameNum

    // while loop keeps looping as long as counter < gameNum
    // line 23-39 goes within loop

    System.out.println("Are you ready-- say true for yes or false for no");
    boolean answer = scan.nextBoolean();

    if (answer) {
      System.out.println("Ok first question...");

      System.out.println("Was Cinderella the first Disney princess? True or false");
      answer = scan.nextBoolean();

      if (!answer) {
        System.out.println("That is correct she was not the first princess");
      } else {
        System.out.println("That is not correct Snow white was the first princess");
      }

      System.out.println("Ok second question");

      System.out.println(
          "Darth Vader famously says the line “Luke, I am your father” in The Empire Strikes Back?True or fasle");
      answer = scan.nextBoolean();

      if (!answer) {
        System.out.println("That is correct the  line is actually “No, I am your father”");
      } else {
        System.out.println("That is not correct");
      }

      System.out.println("Ok thrid question");

      System.out.println("Do the five rings on the Olympic flag interlock?");
      answer = scan.nextBoolean();

      if (answer) {
        System.out.println("That is correct");
      } else {
        System.out.println("That is not correct they are interlocking");
      }

      System.out.println("Ok fourth question");

      System.out.println("Is vietnamese is an official language in Canada");

      answer = scan.nextBoolean();
      if (!answer) {
        System.out.println("That is correct");
      } else {
        System.out.println("That is not correct vietnamese is not the official language of Canada");
      }

      System.out.println("That's the end of the game hope you have a nice day");

    } else {
      System.out.println("Have a nice day...");
    }
   
  }
}
