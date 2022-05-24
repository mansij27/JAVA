class ReverseString {
    public static void  main(String[] args) {
          String str= "Mansi", nstr="";
          char ch;
        System.out.print("Original word: " +str);
        for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("\nReversed word: "+ nstr);
    }
}