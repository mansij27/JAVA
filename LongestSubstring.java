import java.util.*;
import java.lang.*;
import java.io.*;
class LongestSubstring{
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
 
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
 
        return res;
    }
 
    private boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];
 
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        // Your code goes here
        LongestSubstring ob= new LongestSubstring();
        String s = "Hello ji";
        System.out.println("Longest Substring: " +ob.lengthOfLongestSubstring(s));
    }
}