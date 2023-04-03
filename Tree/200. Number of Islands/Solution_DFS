import java.io.*;
import java.util.*;

class NumberOfIslands {


    public int numIslands(char[][] grid) {
        int ans = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] vis = new int[rows][cols];
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                vis[i][j] = 0;
            }
        }
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == '1' && vis[i][j] != 1) {
                    ans++;
                    markVisited(i, j, vis, grid);
                }
            }
        }
        return ans;
    }
    
    public void markVisited(int i, int j, int[][] vis, char[][] grid) {
        int x = i;
        int y = j;
        if (x<0 || x>grid.length-1 || y<0 || y>grid[0].length-1 || grid[x][y]=='0' || vis[x][y]==1) {
            return;
        }
        vis[x][y] = 1;
        if (grid[x][y] == '1') {
            markVisited(x, y-1, vis, grid);
            markVisited(x, y+1, vis, grid);
            markVisited(x-1, y, vis, grid);
            markVisited(x+1, y, vis, grid);
        }
    }
}
