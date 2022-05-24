public class Exception5 {
 
    public static void main(String[] args) {
        try{
             Object[] stringArray = new String[4];        
            stringArray[1] = "Java"; 
            //java.lang.ArrayStoreException here
            stringArray[2] = 20;
        }catch(ArrayStoreException e){
    System.out.println("Array store exception catched here");
            // e.printStackTrace();
        }
 
    }
}