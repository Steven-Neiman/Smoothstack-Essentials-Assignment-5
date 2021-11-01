public class LambdaHaver {
    public static void main(String[] args){
        CheckNumber isOdd = (Integer number) ->{return number%2==1;};
        CheckNumber isPrime = (Integer number) ->{
            for(Integer i=2; i<number; i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        };
        CheckNumber isPalindrome = (Integer number) ->{
            String stringNum = String.valueOf(number);
            for(Integer i=0; i<(stringNum.length()/2); i++){
                if (stringNum.charAt(i)!=stringNum.charAt(stringNum.length()-1-i)){
                    return false;
                }
            }
            return true;
        };
        NumberTransformer rightmostDigit = (Integer number) ->{
            String stringNum = String.valueOf(number);
            Character charNum = stringNum.charAt(stringNum.length()-1);
            return Character.getNumericValue(charNum);
        };
    }
}
