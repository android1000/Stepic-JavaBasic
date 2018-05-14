
public class L_6_1_12 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }
}

class Pair <T> {
    private Object first;
    private Object second;

    private Pair (Object first, Object second) {
        //this.value1 = Objects.requireNonNull(value1);
        this.first = first;
        this.second = second;

    }

    public Object getFirst() {
        return first;
    }

    public  getSecond() {
        return second;
    }

    public static <T> of (Object first, Object second) {
        return new Pair(first,second);
    }

    @Override
    public boolean equals(Object o) {
        return this.first==((Pair) o).getFirst() & this.second==((Pair) o).getSecond();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}