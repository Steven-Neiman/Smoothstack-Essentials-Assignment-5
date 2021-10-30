/*
A class for assignment 5 part 1.3
Checks whether a word is three letters long and starts with "a"
The assignment says to use streams and lambdas but I'm not sure how I could do that without making the
code less elegant
*/

public class CheckThreeAndA {
    public static void main(String[] args){
        String word1 = "any";
        String word2 = "asparagus";
        String word3 = "end";
        CheckThreeAndA checkThreeAndA = new CheckThreeAndA();
        System.out.println("Is " + word1 + " the right kind of word?");
        System.out.println(String.valueOf(checkThreeAndA.threeAndA(word1)));
        System.out.println("Is " + word2 + " the right kind of word?");
        System.out.println(String.valueOf(checkThreeAndA.threeAndA(word2)));
        System.out.println("Is " + word3 + " the right kind of word?");
        System.out.println(String.valueOf(checkThreeAndA.threeAndA(word3)));
    }
    public boolean threeAndA(String toCheck){
        if(toCheck.charAt(0)=='a' && toCheck.length()==3){
            return true;
        }else{
            return false;
        }
    }
}
