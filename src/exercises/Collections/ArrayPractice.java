package exercises.Collections;
import java.util.Arrays;
public class ArrayPractice {

    public static void main (String[] args){

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int number:numbers) {
            System.out.println(number);
        }
        for (int number:numbers) {
            if(number %2 ==0){
                System.out.println(number);
            }

        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));


        String [] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
