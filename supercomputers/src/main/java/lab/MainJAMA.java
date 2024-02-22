package lab;

import jama.Matrix;

import java.time.Duration;
import java.time.Instant;

public class MainJAMA {

    static int size = 500;

    public static void main(String[] args) {
        Matrix a = Matrix.random(size, size);
        Matrix b = Matrix.random(size, size);
        Instant time1 = Instant.now();
        Matrix res = a.times(b);
        Instant time2 = Instant.now();
        System.out.printf("Duration (milliseconds): %d%n", Duration.between(time1, time2).toMillis());
    }
}
