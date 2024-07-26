package org.tinkoffEducation2024;

import java.util.Scanner;

public class Task5v3 {

    public static final int ROWS = 3;

    public static int maxMushroomsDFS(char[][] forest, int lines) {
        int maxMushrooms = 0;
        for (int i = 0; i < ROWS; i++) {
            boolean[][] visited = new boolean[lines][ROWS];
            if (forest[0][i] != 'W') {
                int mushrooms = DFS(forest, visited, 0, i);
                maxMushrooms = Math.max(maxMushrooms, mushrooms);
            }
        }
        return maxMushrooms;
    }

    public static int DFS(char[][] forest, boolean[][] visited, int line, int row) {
        int n = forest.length;
        if (line >= n || row < 0 || row >= ROWS || forest[line][row] == 'W' || visited[line][row]) {
            return 0;
        }

        visited[line][row] = true;

        int currentWeight = (forest[line][row] == 'C') ? 1 : 0;

        int maxWeigh = 0;

        int[] ways = {-1, 0, 1};
        for (int way : ways) {
            int weight = DFS(forest, visited, line + 1, row + way);
            maxWeigh = Math.max(maxWeigh, weight);
        }

        visited[line][row] = false;

        return maxWeigh + currentWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();
        char[][] forest = new char[lines][ROWS];
        for (int i = 0; i < lines; i++) {
            forest[i] = scanner.nextLine().toCharArray();
        }
        System.out.println(maxMushroomsDFS(forest, lines));
    }
}
