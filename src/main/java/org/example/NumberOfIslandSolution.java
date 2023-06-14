package org.example;

public class NumberOfIslandSolution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int countOfIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    countOfIsland++;
                    markCell(grid, i, j);
                }
            }
        }
        return countOfIsland;
    }

    private void markCell(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        markCell(grid, i + 1, j);
        markCell(grid, i - 1, j);
        markCell(grid, i, j + 1);
        markCell(grid, i, j - 1);
    }


}
