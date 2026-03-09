class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\.+");
        StringBuilder r = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].length() == 0) continue;

            if(r.length() > 0){
                r.append(".");
            }

            r.append(words[i]);
        }

        return r.toString();
    }
}