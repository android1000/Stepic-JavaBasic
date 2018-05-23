import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.*;


public class L_6_4_12 {
    public static void main(String[] args) {
        Stream stream = Arrays.stream(new Integer[]{10, 20, 1, 5, 8, 94, 1, -52, 0});
        Comparator<Integer> intComparator = Integer::compare;
        final boolean[] failFlag = {true};
        BiConsumer<Integer, Integer> intConsumer = (min, max) -> {
            System.out.println(min.toString()+" "+max.toString());
        };
        findMinMax(stream, intComparator, intConsumer);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        T min = null;
        T max = null;
        if (!list.isEmpty()){
            min = list.get(0);
            max = list.get(list.size()-1);
        }
        minMaxConsumer.accept(min, max);

    }
}
