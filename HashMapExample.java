import java.util.HashMap;
import java.util.Map;
 
public class HashMapExample {
    public static void main(String[] args)
    {
  
    Map<Character, String> charType
            = new HashMap<Character, String>();

        charType.put('A', "Java");
        charType.put('B', "Network");
        charType.put('C', "Dbms");
        charType.put('D', "Operating systems");
 
        charType.forEach(
            (key, value)
                -> System.out.println(key + " = " + value));
    }
}