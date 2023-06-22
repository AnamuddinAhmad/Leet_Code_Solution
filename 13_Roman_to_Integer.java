class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0; i<s.length();i++){
            int first = map.get(s.charAt(i));
            int second;
            if(i+1<s.length()){
                second=map.get(s.charAt(i+1));
                if(first<second){
                    ans+=(second-first);
                    i++;
                }
                else{
                    ans+=first;
                }
            }
            else{
                ans+=first;
            }
        }
        return ans;
    }
}
