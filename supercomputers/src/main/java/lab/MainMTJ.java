package lab;

import no.uib.cipr.matrix.DenseMatrix;

import java.time.Duration;
import java.time.Instant;

import static lab.Main.getMatrix;

public class MainMTJ {

    static int size = 500;

    public static void main(String[] args) {
        DenseMatrix a = new DenseMatrix(getMatrix(size));
        DenseMatrix b = new DenseMatrix(getMatrix(size));
        DenseMatrix res = new DenseMatrix(size, size);
        Instant time1 = Instant.now();
        a.mult(b, res);
        Instant time2 = Instant.now();
        System.out.printf("Duration (milliseconds): %d%n", Duration.between(time1, time2).toMillis());
    }
}
