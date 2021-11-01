import java.util.ArrayList;

public class Doubler {
    public ArrayList<Integer> doubled(ArrayList<Integer> prepareForTrouble){
        ArrayList<Integer> andMakeItDouble = new ArrayList<Integer>();
        for (Integer i=0; i<prepareForTrouble.size(); i++){
            andMakeItDouble.add(prepareForTrouble.get(i)*2);
        }
        return andMakeItDouble;
    }
    public static void main(String[] args){
        Doubler doubler = new Doubler();
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        inputs.add(1);
        inputs.add(7);
        inputs.add(32);
        ArrayList<Integer> outputs= doubler.doubled(inputs);
        for(Integer i=0; i<outputs.size(); i++){
            System.out.println(String.valueOf(outputs.get(i)));
        }
    }
}
