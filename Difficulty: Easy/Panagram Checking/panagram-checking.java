class Solution {
    public static boolean checkPangram(String s) {
        Set<Character>set=new HashSet<>();
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            set.add(c);
        }
        return set.size()==26;
    }
}