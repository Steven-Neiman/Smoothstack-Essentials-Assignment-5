import java.util.ArrayList;

/*
This class doesn't work and I don't know why. The idea is that attemptSum() will first check for the
running total being too high or right at the target, and then if not it will call itself twice,
first adding the next element to the running total and then not, since either the number will be part of the
sum or it won't. However, it returns false unless the elements in order
*/

public class PossibleToSum {
    public boolean attemptSum(int currentSum, ArrayList<Integer> ints, int target){
        if (currentSum==target){
            return true;
        }
        if(currentSum>target){
            return false;
        }
        if(ints.size()==0){
            return false;
        }
        int addNext = currentSum+ints.remove(0);
        int dontAdd = currentSum;
        if(attemptSum(addNext, ints, target)){
            return true;
        }
        if(attemptSum(dontAdd,ints, target)){
            return true;
        }
        return false;
    }
    public boolean attemptClumpedSum(ArrayList<Integer> ints, Integer target){
        ArrayList<Integer> clumpedInts = new ArrayList<Integer>();
        ints.add(0, 0); // This is kind of inelegant, but adding a new first and last element of 0
        ints.add(0); // lets me loop from the second to the second-to-last element checking their neighbors
        Integer repeats=0;
        for (Integer i=1; i<ints.size()-1; i++){
            if(ints.get(i)!=ints.get(i+1)&&ints.get(i)!=ints.get(i-1)){ //checks for lone values
                clumpedInts.add(ints.get(i));
            } else if(ints.get(i)==ints.get(i+1)){ //increments a counter for clump size if the next element is identical
                repeats++;
            } else{ //turns the clump into a single effective value, and resets the repeats variable
                repeats++;
                clumpedInts.add(ints.get(i)*repeats);
                repeats=0;
            }
        }
        return attemptSum(0, clumpedInts, target);
    }
    public static void main(String[] args){
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        inputs.add(2);
        inputs.add(4);
        inputs.add(8);
        PossibleToSum possibleToSum = new PossibleToSum();
        if(possibleToSum.attemptSum(0,inputs, 10)){
            System.out.println("looks like that option works");
        } else {
            System.out.println("looks like that option doesn't work");
        }
    }
}
