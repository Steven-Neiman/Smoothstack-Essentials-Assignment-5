import java.util.ArrayList;
import java.util.Arrays;

/*
A class for assignment 5 part 1.2
This object takes a list of integers and concatenates them with StringBuilder, adding an "e" for every even
and an "o" for every odd number.
*/

public class EvenOddString {
    public static void main(String[] args){
        ArrayList<Integer> ints = new ArrayList<Integer>(Arrays.asList(2,5,4));
        EvenOddString evenOddString = new EvenOddString(ints);
    }
    ArrayList<Integer> ints;
    public EvenOddString(ArrayList<Integer> integers){
        ints=integers;
        StringBuilder makeString=new StringBuilder();
        for(Integer number:ints){
            if (number%2==0){
                makeString.append("e");
            }else{
                makeString.append("o");
            }
            makeString.append(Integer.toString(number));
        }
        String numberString=makeString.toString();
        System.out.println(numberString);
    }

}
