public class Solution {
    public String reverseWords(String s) {
        StringBuilder str= new StringBuilder();
        String [] cc= s.split(" ");
        for(String word:cc){
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            str.append(temp);
            str.append(" ");
        }
        return str.toString().trim();
    }
}
