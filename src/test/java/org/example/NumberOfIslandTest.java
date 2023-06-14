package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandTest {

    @Test
    void whenContainsIslandThenReturnNumberOfIsland() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumberOfIslandSolution numberOfIsland = new NumberOfIslandSolution();
        assertEquals(3, numberOfIsland.numIslands(grid));
    }
}