//NegativeArraySizeExceptionExample

public class Exception6 {
    public static void main(String[] args) {
        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException nase) {
           nase.printStackTrace();
             System.out.println("Array is negative");
            //handle the exception
        }
        System.out.println("Continuing execution...");
    }
}