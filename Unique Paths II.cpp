class Solution {
public:
    int dp[101][101];
    int solve(int i,int j,int n,int m,vector<vector<int>> grid)
    {
        if(i>n-1 or j>m-1 or grid[i][j]==1)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(i==n-1 and j==m-1)
        {
            return 1;
        }
        return dp[i][j]=solve(i+1,j,n,m,grid)+solve(i,j+1,n,m,grid);
            
    }
    int uniquePathsWithObstacles(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        memset(dp,-1,sizeof(dp));
        return solve(0,0,n,m,grid);
    }
};
