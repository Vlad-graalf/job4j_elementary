package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(x2)
            && isValid(y1) && isValid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                int dx = (x2 - x1) / Math.abs(x2 - x1);
                int dy = (y2 - y1) / Math.abs(y2 - y1);
                int currentX = x1;
                int currentY = y1;
                while (currentX != x2 && currentY != y2) {
                    currentX += dx;
                    currentY += dy;
                    result++;
                }
            }
        }
        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
