public class HackerEarth{
    public static void main(String args[]){
        String h1=new String("abc");
        String h2=new String("abc");
        String h3=h1;

        System.out.println(h1==h3);
        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));

        String str="bc";
        String str1="bca";
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
    }
}

