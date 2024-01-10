class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }

        String sub=s.substring(0,1);
        int maxlen=1;

        for(int i=0; i < s.length();i++){
            for(int j=i+maxlen;j<=s.length();j++){
                if(palindrome(s.substring(i,j)) && j-i>maxlen){
                    maxlen=j-i;
                sub=s.substring(i,j);
                }
            }
        }
         return sub;
    }
    
    //for checking palindrome.
    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
