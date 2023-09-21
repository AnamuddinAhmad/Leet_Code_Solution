class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double result =0.00000;
        if(n==0 && m==0){
            return result;
        }
        int [] nums=new int[m+n];
        int y=0;
        while(y<m){
            nums[y]=nums1[y];
            y++;
        }
        int i=0;
        while(i<n){
            nums[i+y]=nums2[i];
            i++;
        }

        Arrays.sort(nums);
        int mid=(m+n)/2;
        if((m+n)%2==0){
            result=(double)(nums[mid]+nums[mid-1])/2;
        }else{
            result=nums[mid];
        }
        return result;

    }
}
