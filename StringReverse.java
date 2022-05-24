public class StringReverse {
   public static void main(String args[]) {
      String str = "hi welcome to java class";
      String strArray[] = str.split(" ");
      StringBuffer sb= new StringBuffer(str);
      sb.reverse();
      for(int i=0 ; i<str.length(); i++){
      if(str.charAt(i)== ' '){
         sb.insert(i, " ");
      }
   }
   sb.append("");
    System.out.println(str);
   System.out.println(sb);
}
}
