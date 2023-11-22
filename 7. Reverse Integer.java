class Solution {
    public int reverse(int x) {
     int sing=1;
     if(x<0){
        sing=-1;
        x=-x;
     }
        int rev=0;
        int mahi=0; 
        while(x!=0){
            mahi=x%10;
            if(rev > (Integer.MAX_VALUE - mahi) / 10) {
                return 0; // or return rev; as per your requirement
            }
            rev=rev*10+mahi;
            x/=10;
        } 
        return sing*rev; 
    }
}
