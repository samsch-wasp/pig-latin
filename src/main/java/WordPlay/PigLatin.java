package WordPlay;

import java.util.*;

public class PigLatin{



    public static Boolean isConsonant(char c){
        List consonants = Arrays.asList( 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z',
                                         'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
        return consonants.contains(c);
    }

    public static Boolean isVowel(char c){
        List consonants = Arrays.asList('A', 'a','I', 'i', 'E', 'e','O', 'o');

        return consonants.contains(c);
    }


    public static String pigLatin(String in){

        in = in.toLowerCase(); // Only support for lowercase

        String out = in;


        if(isConsonant(in.charAt(0))){
            if(isConsonant(in.charAt(1))){
                // Two initial chars consonants
                // To be implemented
            }else{
                // First char cosonant, second other
                out = in.substring(1) + in.substring(0,1) + "ay";
            }
        }else if(isVowel(in.charAt(0))){
            // First char not consoant, could be vovel
            out = in + "way";
        }


        return out;
    }

    public static void main (String args[]) {
        String word = "Banana"; // Default word

        if(args.length>0){
            word = args[0];
        }

        System.out.println(pigLatin(word));
    }
}
