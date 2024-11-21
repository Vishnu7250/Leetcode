// DP DP TABULATION TABULATION

// we are using 2d dp array to store the previous subproblem ans
//if grid is marked 1 we just simply return 0


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if(i == 0 && j == 0) dp[i][j] = 1;
                else{
                    int up = 0;
                    int left = 0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up + left;
                }
            }
        }


        return dp[m-1][n-1];
    }
}

// TC : O(N x M)
// SC : (N x M)