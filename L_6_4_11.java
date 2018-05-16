import java.util.Random;
import java.util.stream.IntStream;
public class L_6_4_11 {
    public static void main(String[] args) {
        IntStream intStream = pseudoRandomStream(13);
        intStream.limit(10)
                .peek(System.out::println)
                .sum();
        //System.out.println(mid(123456));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> x * x / 10 % 1000);
    }

    private static int mid(int i) {
        return (i%10000)/10;
    }

}
