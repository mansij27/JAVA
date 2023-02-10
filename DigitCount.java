public class DigitCount{
    public static void main(String aegs[]){
        String str="hello 678 world5 is awesome77";
        int digit=0, letter=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                digit++;
            }
            else if ((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)){
                letter++;
            }
        }
        System.out.println("Count of digits in string is " +digit + " and letters are " +letter);
    }
}