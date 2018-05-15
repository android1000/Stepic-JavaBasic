import java.util.Objects;
import java.util.function.BiConsumer;

public class L_6_1_12 {

    static class Pair <First, Second> {
        private final First first;
        private final Second second;

        private Pair(First first, Second second) {
            this.first = first;
            this.second = second;
        }

        public First getFirst() {
            return first;
        }

        public Second getSecond() {
            return second;
        }

        public static <First,Second> Pair <First,Second> of (First first, Second second) {
            return new Pair <> (first, second);
        }

        @Override
        public boolean equals(Object o) {
            if (this==o){
                return true;
            }
            if (o instanceof Pair){
                Pair o1=(Pair)o;
                return Objects.equals(this.getFirst(),o1.getFirst()) & Objects.equals(this.getSecond(),o1.getSecond());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.getFirst())+Objects.hashCode(this.getSecond());
        }

        public void ifPresent(BiConsumer<? super First,? super Second> biConsumer){

        }

    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println(i);
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
        System.out.println(Pair.of(null, "hello").equals(Pair.of(null, "hello")));
    }
}
