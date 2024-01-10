class Solution {
    public String intToRoman(int num) {
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb= new StringBuilder();
        for(int i=val.length-1;i>=0 && num>0;i--){
            while(num>=val[i]){
                num-=val[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
