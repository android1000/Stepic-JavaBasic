import java.util.stream.IntStream;
public class L_6_4_11 {
    public static void main(String[] args) {
        IntStream intStream = pseudoRandomStream(13);
        System.out.println(
                intStream.limit(10)
                .peek(System.out::println)
                .sum()
        );
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> x * x / 10 % 1000);
    }
}
