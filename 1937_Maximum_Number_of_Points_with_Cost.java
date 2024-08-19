class Solution {
    public long maxPoints(int[][] points) {
         int m = points.length;
        int n = points[0].length;
        
        // dp array to store max points at each row and column
        long[] dp = new long[n];
        
        // Initialize dp array with the first row of points
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }
        
        // Iterate over each row starting from the second row
        for (int i = 1; i < m; i++) {
            long[] left = new long[n];
            long[] right = new long[n];
            
            // Compute the max points possible from the left side
            left[0] = dp[0];
            for (int j = 1; j < n; j++) {
                left[j] = Math.max(left[j - 1], dp[j] + j);
            }
            
            // Compute the max points possible from the right side
            right[n - 1] = dp[n - 1] - (n - 1);
            for (int j = n - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1], dp[j] - j);
            }
            
            // Update dp array for the current row
            for (int j = 0; j < n; j++) {
                dp[j] = points[i][j] + Math.max(left[j] - j, right[j] + j);
            }
        }
        
        // The maximum value in the dp array is the answer
        long maxPoints = 0;
        for (int j = 0; j < n; j++) {
            maxPoints = Math.max(maxPoints, dp[j]);
        }
        
        return maxPoints;
    }
}
