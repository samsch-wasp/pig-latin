package WordPlay;

import java.util.*;

public class PigLatin{



    public static Boolean isConsonant(char c){
        List consonants = Arrays.asList( 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'W',
                                         'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'w');
        return consonants.contains(c);
    }

    public static Boolean isVowel(char c){
        List consonants = Arrays.asList('A','E','I','O',
                                        'a', 'e', 'i', 'o');
        return consonants.contains(c);
    }


    public static String pigLatin(String in){

        in = in.toLowerCase(); // Only support for lowercase

        String out = in;


        if(isConsonant(in.charAt(0))){
            // Consonant rule with cluster support
            int nConsonants = 1;
            while(nConsonants < in.length()){
                if(!isConsonant(in.charAt(nConsonants)))
                    break;
                nConsonants++;
            }

            out = in.substring(nConsonants) + in.substring(0,nConsonants) + "ay";

        }else if(isVowel(in.charAt(0))){
            // First char not consoant, could be vowel
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
