package exercises;

import java.util.Scanner;
public class NewHello {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Hello, whats your name?");
      String name = input.nextLine();
      System.out.println("Hello"+ name );


    }
}
