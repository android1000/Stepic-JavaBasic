import java.util.function.DoubleUnaryOperator;

public class L_3_5_7 {

    private static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 1000000;
        double result = 0;
        double h;
        h = (b - a) / n;
        for (int i = 0; i < n; i++) {
            result = result + f.applyAsDouble(a + h * (i + 0.5));
        }
        return result * h;
    }


    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }
}
