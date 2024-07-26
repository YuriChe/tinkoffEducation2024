package org.tinkoffEducation2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tinkoffEducation2024.Task5v3.maxMushroomsDFS;

public class Task5v3Test {
    @Test
    public void test1() {
        int n = 5;
        char[][] forest = {
                {'.', 'C', 'W'},
                {'C', '.', 'C'},
                {'W', 'C', '.'},
                {'.', 'W', 'C'},
                {'C', 'C', '.'}
        };
        assertEquals(5, maxMushroomsDFS(forest, n));

    }

    @Test
    public void test2() {
        int n = 5;
        char[][] forest = {
                {'C', 'W', 'W'},
                {'C', 'W', 'C'},
                {'C', 'W', 'C'},
                {'.', 'W', 'C'},
                {'W', 'W', 'C'}
        };
        assertEquals(3, maxMushroomsDFS(forest, n));

    }
}
