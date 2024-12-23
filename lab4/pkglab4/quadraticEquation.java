package pkglab4;
import java.util.function.Function;

public class quadraticEquation implements Function<Double[], Double[]> {

    public Double[] apply(Double[] input) {
        double a = input[0];
        double b = input[1];
        double c = input[2];

        if (a == 0) {
            return new Double[]{Double.NaN, Double.NaN};
        }

        double x = b * b - 4 * a * c;
        if (x >= 0) {
            double root1 = (-b + Math.sqrt(x)) / (2 * a);
            double root2 = (-b - Math.sqrt(x)) / (2 * a);
            return new Double[]{root1, root2};
        }else {
            return new Double[]{Double.NaN};
        }
    }

}

