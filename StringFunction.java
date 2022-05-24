public class StringFunction {
    static String s1 = "Hello";
    static String s2 = "World";

    void checkEquality() {
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s1 : " + (s1 == s1));
        System.out.println("s2 == s2 : " + (s2 == s2));
    }

    void findLength() {
        System.out.println("Length of s1 " + s1.length());
        System.out.println("Length of s2 " + s2.length());
    }

    void replaceLetters() {
        System.out.println("s1.replace('l', 'Z') : " + s1.replace('l', 'Z'));
        System.out.println("s2.replace('l', 'Z') : " + s2.replace('l', 'Z'));
    }

    void convertToUpperCase() {
        System.out.println("s1.toUpperCase() : " + s1.toUpperCase());
        System.out.println("s2.toUpperCase() : " + s2.toUpperCase());
    }

    void concatenate2Strings() {
        System.out.println("s1.concat(s2) : " + s1.concat(s2));
    }
    public static void main(String[] args) {
        StringFunction sf = new StringFunction();
        sf.checkEquality();
        System.out.println();
        sf.findLength();
        System.out.println();
        sf.replaceLetters();
        System.out.println();
        sf.convertToUpperCase();
        System.out.println();
        sf.concatenate2Strings();
    }
}
