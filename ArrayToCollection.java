import java.util.*;
 
public class ArrayToCollection {
    public static void main(String args[])
    {
        String subjectArray[]
            = { "Java", "Dbms", "Networking", "Operating System" };
       
        System.out.println("Array input: "
                           + Arrays.toString(subjectArray));
 
        List subjectList = Arrays.asList(subjectArray);
        System.out.println("Converted elements: "  + subjectList);
    }
}