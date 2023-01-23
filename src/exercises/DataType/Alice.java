package exercises.DataType;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
        String first_sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Which word would you like to search in the first sentence of the book 'Alice in wonderland'");
        String word = input.nextLine();
        for ( String w : first_sentence.split(" ")) {
            if( w.toUpperCase().equals(word.toUpperCase()) )
            {
               System.out.println("true");
               return;
            }
        }
        System.out.println("false");
    
    }
    
    
}
