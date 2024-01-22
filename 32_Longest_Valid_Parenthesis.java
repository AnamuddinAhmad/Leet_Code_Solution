class Solution {
    public int longestValidParentheses(String s) {
        int n=0;
        if(s.length()==0){
            return n;
        }
        Stack<Integer> ch = new Stack<>();
        ch.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ch.push(i);
            }else{
                ch.pop();
                if(!ch.isEmpty()){
                    n=Math.max(n,i-ch.peek());
                }else{
                    ch.push(i);
                }
            }
        }
        return n;
    }
}
