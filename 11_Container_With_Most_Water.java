class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxwater=0;
        while(lp<=rp){
            int hei=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int water=hei*width;
            maxwater=Math.max(maxwater,water);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
}
