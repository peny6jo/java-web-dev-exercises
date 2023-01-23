package exercises.DataType;

import java.util.Scanner;

public class Alice2 {

    public static void main(String args) {
        Scanner input = new Scanner(System.in);
        String first_sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("This is the first sentence in the book 'Alice in Wonderland'");
        System.out.println(first_sentence);
        System.out.println("Which word would you like to remove in the first sentence of the book 'Alice in wonderland'");
        String word = input.nextLine();
        String modified_sentence = "";

        for ( String w : first_sentence.split(" ")) {
            if( w.equalsIgnoreCase(word) )
            {
                System.out.println("The index is " + first_sentence.indexOf(w)+ " And his length is " + w.length());
                modified_sentence = first_sentence.replace(w," ");
                break;
            }
        }

        System.out.println(modified_sentence);

    }

}
