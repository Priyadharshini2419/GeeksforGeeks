// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
}