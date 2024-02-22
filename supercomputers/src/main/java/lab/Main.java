package lab;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static double[][] getMatrix(int size) {
        double[][] matrix = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextDouble();
            }
        }
        return matrix;
    }

    static int size = 500;

    public static void main(String[] args) {
        double[][] a = getMatrix(size);
        double[][] b = getMatrix(size);
        double[][] res = new double[size][size];
        Instant time1 = Instant.now();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double x = 0.0;
                for (int k = 0; k < size; k++) {
                    x += a[i][k] * b[k][j];
                }
                res[i][j] = x;
            }
        }
        Instant time2 = Instant.now();
        System.out.printf("Duration (milliseconds): %d%n", Duration.between(time1, time2).toMillis());
    }
}
