import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
A class for assignment 5 part 1.1
Takes a collection of strings and sorts them according to any Comparator lambda function passed to it
*/

public class StringSorter{
    public static void main(String[] args){
        System.out.println("placeholder");
    }
    private ArrayList<String> listOfStrings;
    public StringSorter(ArrayList<String> stringlist){
        listOfStrings=stringlist;
    }
    public ArrayList<String> sortBy(Comparator<String> compareBy){
        return new ArrayList<String>(listOfStrings.stream().sorted(compareBy).collect(Collectors.toList()));
    }
}