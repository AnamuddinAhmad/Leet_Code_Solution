class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean resutl=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                resutl=false;
               break;
            }
        }
        if(resutl==true){
            return resutl;
        }else{
            resutl =true;
             for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                resutl = false;
                break;
            }
        }
        }
       return resutl;
    }
}
