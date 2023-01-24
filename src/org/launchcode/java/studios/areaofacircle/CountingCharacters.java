package org.launchcode.java.studios.areaofacircle;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class CountingCharacters {

// write a program to count the number of times each character occurs in a string and then print the results to the console.
public static void main(String[] args) throws FileNotFoundException {
    String word ="";
//    //Reading from user console
//    Scanner input = new Scanner(System.in);
//    System.out.println("Type a word");
//    word = input.nextLine();

    //Reading from a file
    try{

        File my_file = new File("src/document/Example.txt");
        Scanner fileInput = new Scanner(my_file);
        word = "";
        while(fileInput.hasNextLine()){

            word += fileInput.nextLine();
        }
        fileInput.close();
    }
    catch(FileNotFoundException error) {
        System.out.println("The file is not found");
        error.printStackTrace();

    }


    HashMap<Character,Integer> dictionary = count((word.toLowerCase()));
    for(Map.Entry<Character, Integer> pare:dictionary.entrySet() ){
        System.out.println(pare);
    }


}



    public static HashMap<Character,Integer> count (String word){
    HashMap<Character, Integer> dictionary =  new HashMap<>();
    for ( Character character: word.toCharArray()) {
        if (character.toString().matches("^[a-z]*$")) {
            if (!dictionary.containsKey(character)) {
                dictionary.put(character, 1);
            } else {
                int new_value = dictionary.get(character) + 1;
                dictionary.put(character, new_value);
            }
        }
    }
    return dictionary;
}
}
