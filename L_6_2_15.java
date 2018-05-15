import java.awt.*;
import java.util.*;
import java.util.List;

public class L_6_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int i = 1;
        while (scanner.hasNext()) {
            Integer num=scanner.nextInt();
            if (i % 2 == 0)  {
                result.add(num);
            }
            i++;
        }
        Collections.reverse(result);
        String need="";
        for (Integer s:result){
            System.out.print(need+s.toString());
            need=" ";
        }
    }
}

