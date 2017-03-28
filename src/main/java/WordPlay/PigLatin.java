package WordPlay;

import java.util.*;

public class PigLatin{



    public static Boolean isConsonant(char c){
        List consonants = Arrays.asList( 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'W', 'Y',
                                         'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'w','y');
        return consonants.contains(c);
    }

    public static Boolean isVowel(char c){
        List consonants = Arrays.asList('A','E','I','O','U',
                                        'a', 'e', 'i', 'o','u');
        return consonants.contains(c);
    }


    public static String pigLatin(String ins){

        String[] in_array = ins.split(" ");

        String[] out_array = new String[in_array.length];

        for(int i = 0; i< in_array.length; i++){

            String in = in_array[i].toLowerCase(); // Only support for lowercase

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

            out_array[i] = out;

        }

        return String.join(" ", out_array);
    }

    public static void main (String args[]) {
        String word = "Banana"; // Default word

        if(args.length>0){
            word = args[0];
        }

        System.out.println(pigLatin(word));
    }
}
