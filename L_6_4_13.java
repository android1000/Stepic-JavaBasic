import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L_6_4_13 {
    public static void main(String[] args) throws  Exception{
        Stream<String> stream = new BufferedReader(new InputStreamReader(System.in, "UTF-8")).lines();
        Stream<String> wordsStream=stream.map(line -> line.toLowerCase().split("[^a-zа-яё0-9]+")).flatMap(Arrays::stream);
        Map<String, Long> map = wordsStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Long> resultMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry
                                        .<String, Long>comparingByValue()
                                        .reversed()
                                        .thenComparing(Map.Entry.comparingByKey()))
                               .limit(10)
                               .forEachOrdered(
                                    e -> resultMap
                                    .put(e.getKey(), e.getValue())
                               );
        resultMap.entrySet().forEach(e -> System.out.println(e.getKey()));

    }
}
