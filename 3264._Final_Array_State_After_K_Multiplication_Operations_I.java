class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int arr[]=new int[2];
        for(int i=0;i<k;i++){
            arr=getmin(nums);
            nums[arr[0]]=arr[1]*multiplier;
        }
        return nums;
    }
    private static int[] getmin(int [] nums){
        int idx=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                idx=i;
            }
        }
        return new int[]{idx,min};
    }
}
