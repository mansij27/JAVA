// public class ConvertStringToInteger {  
//     public static void main(String[] args) {  
//         //1st way  
//         String str1 = "135";  
//         int result = Integer.parseInt(str1); // Using Integer.parsrInt()  
//         System.out.println(result);  
   
//         //2nd way  
//         String str2 = "5";  
//         Integer result2 = Integer.valueOf(str2); // Using Integer.valueOf()  
//         System.out.println(result2);  
   
//     }  
// }  


public class ConvertStringToInteger {
    public static void main(String[] args) {

        // String to integer
        int number = Integer.parseInt("1234");
        System.out.println(" String to int Number :: " + number);

        //integer to string
        int x = 5;    
        String str = Integer.toString(x); // using Integer.toString()  
        System.out.println("Integer To string: " +str);  
    }
}