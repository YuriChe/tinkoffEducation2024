package org.tinkoffEducation2024;

import java.util.Scanner;

public class task5graph {

    private static final int ROWS = 3; // Количество столбцов в лесу (3)

    // Функция для вычисления максимального количества грибов
    public static int maxMushroomsDFS(int n, char[][] forest) {
        // Массив для отслеживания посещенных вершин
        boolean[][] visited = new boolean[n][ROWS];

        // Переменная для хранения максимального количества грибов
        int maxMushrooms = 0;

        // Запуск DFS из каждой клетки первой строки
        for (int j = 0; j < ROWS; j++) {
            if (forest[0][j] != 'W') {
                // Для каждой стартовой точки запускаем DFS и находим максимальный вес пути
                int mushrooms = dfs(forest, 0, j, visited);
                maxMushrooms = Math.max(maxMushrooms, mushrooms);
            }
        }

        return maxMushrooms;
    }

    // Реализация поиска в глубину
    private static int dfs(char[][] forest, int i, int j, boolean[][] visited) {
        int n = forest.length;

        // Проверка на выход за границы и на кусты
        if (i < 0 || i >= n || j < 0 || j >= ROWS || forest[i][j] == 'W' || visited[i][j]) {

            return 0;
        }

        // Отметить текущую клетку как посещенную
        visited[i][j] = true;

        // Текущий вес (грибы дают 1, трава 0)
        int currentWeight = (forest[i][j] == 'C') ? 1 : 0;

        // Все возможные направления движения
//        int[] di = {1, 1, 1};    // Переходы вниз по строкам
        int[] dj = {-1, 0, 1};   // Переходы по столбцам (влево, вниз, вправо)

        // Поиск максимального пути в глубину
        int maxWeight = 0;
        for (int k = 0; k < 3; k++) {
//            int ni = i + di[k]; // Следующая строка
            int ni = i + 1;
            int nj = j + dj[k]; // Следующий столбец

            // Рекурсивный вызов DFS для следующих позиций
            int weight = dfs(forest, ni, nj, visited);
            maxWeight = Math.max(maxWeight, weight);
        }

        // Вернуть текущую клетку в состояние "не посещено" для других путей
        visited[i][j] = false;

        return currentWeight + maxWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение числа строк n
        int n = scanner.nextInt();
        scanner.nextLine(); // Переход на следующую строку

        // Чтение леса
        char[][] forest = new char[n][ROWS];
        for (int i = 0; i < n; i++) {
            forest[i] = scanner.nextLine().toCharArray();
        }

        // Вычисление и вывод максимального количества грибов
        int result = maxMushroomsDFS(n, forest);
        System.out.println(result);
    }
}