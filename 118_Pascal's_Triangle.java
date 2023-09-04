class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mai=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> list=new ArrayList<>();
            int k=0;
            for (int j = 0; j <=i; j++) {
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    int sum=mai.get(i-1).get(k)+mai.get(i-1).get(k+1);
                    k++;
                    list.add(sum);
                }
            }
            mai.add(list);
        }
        
        return mai;
    }
}
