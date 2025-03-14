// Guesser.java

import java.util.*;

public class Guesser{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean keepGoing=true;
    int num;
    while(keepGoing){
      menu();
      num = input.nextInt();
      if(num==1){
        human();
      } // end if
      if(num==2){
        computer();
      } // end if
      if(num==0){
        keepGoing=false;
      } // end if
    } // end while
  } // end main
  static void menu(){
    System.out.println("0) Exit");
    System.out.println("1) Human Guesser");
    System.out.println("2) Computer Guesser");
    System.out.println("Please enter 0-2: ");
  } // end menu
  static void human(){
    boolean keepGoing=true;
    int i=0;
    int humGuess;
    System.out.println("Human guesser");
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int randomInt = random.nextInt(100)+1;
    while(keepGoing){
      i++;
      System.out.print(i + ") Please enter a number: ");
      humGuess = input.nextInt();
      if(randomInt < humGuess){
        System.out.println("Too high");
      } // end if
      if(randomInt > humGuess){
        System.out.println("Too low");
      } // end if
      if(randomInt == humGuess){
        System.out.println("Correct");
	if(i > 7){
          System.out.println("Do you even know what the objective is?\n");
	} // end if
	if(i == 7){
          System.out.println("Very average\n");
	} // end if
	if(i < 7){
          System.out.println("Great job\n");
	} // end if
	keepGoing=false;
      } // end if
    } // end while
  } // end human
  static void computer(){
    boolean keepGoing=true;
    int i=0;
    int comGuess=50;
    double num=50;
    String humHint;
    Scanner input = new Scanner(System.in);
    System.out.println("Computer guesser");
    while(keepGoing){
      i++;
      System.out.println(i + ") I guess " + comGuess);
      System.out.println("Too (H)igh, too (L)ow, or (C)orrect? ");
      humHint=input.nextLine();

      if(humHint.equals("H")){
        num=Math.ceil(num*.5);
	comGuess=comGuess - (int)num;
      } // end if
      if(humHint.equals("L")){
	num=Math.ceil(num*.5);
        comGuess=comGuess+(int)num;
      } // end if
      if(humHint.equals("C")){
        System.out.println();
	keepGoing=false;
      } // end if
    } // end while
  } // end computer
} // end Guesser
