package exercises.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main( String[] args){

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList( 1,2,3,4,5,6,7,8,9,10));
//        System.out.println(sumEvenNumbers(numbers));

        ArrayList<String> all_words = new ArrayList<>(Arrays.asList("Penelope", "love", "bottle", "pencil", "block", "monitor", "pen", "laptop"));
//        System.out.println(fiveLettersWord(all_words));
        System.out.println(kLettersWord(all_words));

    }

    //static method to find the sum of all the even numbers in an ArrayList
    public static int sumEvenNumbers(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number:numbers) {
            if (number %2==0){
                sum += number;
            }
        }
        return sum;
    }

    //static method to print out each word in a list that has exactly 5 letters.
    public static  ArrayList<String> fiveLettersWord(ArrayList<String> list){
        ArrayList<String> five_letters_list = new ArrayList<>();
        for (String word: list) {
            if ( word.length() == 5){
                five_letters_list.add(word);
            }
        }
        return five_letters_list;
    }

    //static method to print out each word in a list that has exactly k letters.
    public static  ArrayList<String> kLettersWord(ArrayList<String> list){
        ArrayList<String>  k_letters_list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters you want the word have?");
        int k = input.nextInt();
        for (String word: list) {
            if ( word.length() == k){
                k_letters_list.add(word);
            }
        }
        return k_letters_list;
    }

}
