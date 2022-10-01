class Solution {
    int grid[][];
    public int orangesRotting(int[][] grid) {
        this.grid=grid;
        int m=grid.length;
        int n=grid[0].length;
        int z=0;
        int ans=0;
        do
        {
            z=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==ans+2)
                        z=Math.max(z,f(i,j,ans+3));
                    // if(z==1)
                    //     break;
                }
                // if(z==1)
                //     break;
            }
            if(z==1)
            ans++;
        }while(z==1);
        
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==1)
                        return -1;
                }
            }
        return ans;
    }
    int f(int x,int y,int k)
    {
        int m=grid.length;
        int n=grid[0].length;
        int z=0;
        if(x>=1 && grid[x-1][y]==1)
        {
            grid[x-1][y]=k;
            z=1;
        }
        if(x+1<=m-1 && grid[x+1][y]==1)
        { 
            grid[x+1][y]=k;
            z=1;
        }
        if(y>=1 && grid[x][y-1]==1)
        {
            grid[x][y-1]=k;
            z=1;
        }
        if(y+1<=n-1 && grid[x][y+1]==1)
        {
            grid[x][y+1]=k;
            z=1;
        }
        grid[x][y]=3;
        return z;
    }
}
