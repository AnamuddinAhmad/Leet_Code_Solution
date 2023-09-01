class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==0){
                    int temp =nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=temp;
                }
               else if(nums1[i]>=nums2[j]){
                int temp =nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
               }
              
            }

        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
    }
}
