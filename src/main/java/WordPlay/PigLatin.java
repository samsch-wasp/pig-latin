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

            //String in = in_array[i].toLowerCase(); // Only support for lowercase

            String in = in_array[i];
            
            boolean capital = Character.isUpperCase(in.charAt(0)); //check if first letter capital

            in = in.toLowerCase();
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
                // First char vowel
                out = in + "way";
            }

            if(capital)
                out = out.substring(0,1).toUpperCase() + out.substring(1); //set capital letter

            out_array[i] = out;

        }

        return String.join(" ", out_array);
    }

    public static void main (String args[]) {

        if(args.length == 0){
            System.out.println("Proper Usage is: java program \"my sentence\"");
            System.exit(0);
        }

        String words = "";
       
        if(args.length>0){
            words = args[0];
        }

        System.out.println(pigLatin(words));
    }
}
