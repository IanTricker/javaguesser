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
        //human();
      } // end if
      if(num==2){
        //computer();
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
} // end Guesser
