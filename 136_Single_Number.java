class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0,e=nums[0];
        while (i < nums.length) {
            if (i < nums.length-1 && nums[i] ==nums[i+1]) {
                i+=2;
            }else{
                e=nums[i];
                i++;
            }
        }
        return  e;
    }
}
