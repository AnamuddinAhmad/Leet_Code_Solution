class Solution {
    public char findTheDifference(String s, String t) {
       int total=0;
        for (int i = 0; i < t.length(); i++) {
           total=total+t.charAt(i);

        }
         for (int j = 0; j < s.length(); j++) {
                total=total-s.charAt(j);
            }
        
        return (char)total;
    }
}
