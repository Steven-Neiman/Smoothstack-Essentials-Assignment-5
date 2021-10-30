import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
A class for Assignment 5 part 1.1
If I'm understanding last bit of this assignment correctly I think I started out doing it that way
and I'm not sure how else I would do it.
*/ 

public class StringSorterController {
    public static void main(String[] args){
        Comparator<String> shortToLong = (String o1, String o2) -> {
            return o1.length()-o2.length();
        };
        Comparator<String> longtoShort = (String o1, String o2) -> {
            return o2.length()-o1.length();
        };
        Comparator<String> alphabetical = (String o1, String o2) -> {
            return o1.compareTo(o2);
        };
        Comparator<String> hasLetterE = (String o1, String o2) -> {
            int firstHasE=0;
            int secondHasE=0;
            for(char character:o1.toCharArray()){
                if(character=='e'){
                    firstHasE = 1;
                    break;
                }
            }
            for(char character:o2.toCharArray()){
                if(character=='e'){
                    secondHasE = 1;
                    break;
                }
            }
            return secondHasE-firstHasE;
        };
        ArrayList<String> stringlist = new ArrayList<String>(Arrays.asList("the","quick","brown","fox","jumped","over","the","lazy","dog"));
        StringSorter stringSorter = new StringSorter(stringlist);
        System.out.println("sorting short to long");
        for(String word:stringSorter.sortBy(shortToLong)){
            System.out.println(word);
        }
        System.out.println("sorting long to short");
        for(String word:stringSorter.sortBy(longtoShort)){
            System.out.println(word);
        }
        System.out.println("sorting alphabetically");
        for(String word:stringSorter.sortBy(alphabetical)){
            System.out.println(word);
        }
        System.out.println("sorting by presence of the letter \"e\"");
        for(String word:stringSorter.sortBy(hasLetterE)){
            System.out.println(word);
        }
    }
}
