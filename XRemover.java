import java.util.ArrayList;

public class XRemover {
    public String noX(String withX){
        StringBuilder withoutX = new StringBuilder();
        for (Integer i=0; i<withX.length(); i++){
            Character ch =withX.charAt(i);
            if(!ch.equals('x')){
                withoutX.append(ch);
            }
        }
        return withoutX.toString();
    }
    public ArrayList<String> noXList(ArrayList<String> inputs){
        ArrayList<String> outputs = new ArrayList<String>();
        for(Integer i=0;i<inputs.size();i++){
            outputs.add(noX(inputs.get(i)));
        }
        return outputs;
    }
    public static void main(String[] args){
        XRemover xRemover = new XRemover();
        ArrayList<String> wordsWithX= new ArrayList<String>();
        wordsWithX.add("Saxophone");
        wordsWithX.add("Laxative");
        wordsWithX.add("tuba");
        ArrayList<String> wordsWithoutX= xRemover.noXList(wordsWithX);
        for(Integer i=0; i<wordsWithoutX.size(); i++){
            System.out.println(wordsWithoutX.get(i));
        }
    }
}
