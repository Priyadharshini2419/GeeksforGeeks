class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        int[]f=new int[26];
        for(int i=0;i<s1.length();i++){
            f[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
           if(f[s2.charAt(i)-'a']==0){
               return false;
           }
           f[s2.charAt(i)-'a']--;
        }
    return true;
    }
}