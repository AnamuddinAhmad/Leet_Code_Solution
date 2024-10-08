public class PermutaionCombination {
    public static void main(String[] args) {
        
        System.out.println("Possible Combination : "+possibleCombination("",3,1,2));
    }

    public static int possibleCombination(String str,int n,int b,int c){
        int count=0;
        if(n==0){
            System.out.println(str);
            return count+=1;
        }
        if(b>0){
            count+=possibleCombination(str+"b", n-1, b-1, c);
        }
        if (c>0) {
            count+=possibleCombination(str+"c", n-1, b, c-1);
        }

        count+=possibleCombination(str+"a", n-1, b, c);

        return count;
    }
}

