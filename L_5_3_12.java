import java.lang.Exception;
import java.util.Scanner;

public class L_5_3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (scanner.hasNext()) {
            try {
                result += Double.parseDouble(scanner.next());
            }
            catch (Exception e){
            }
        }
        System.out.printf("%.6f",result);
    }
}

