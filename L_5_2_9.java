import java.io.*;

public class L_5_2_9 {
    public static void main(String[] args) {
        int last = 0;
        int next = 0;
        try {
            last = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (last > 0) {
            try {
                next = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (last!=13 | next!=10){
                System.out.write(last);
            }
            last=next;
        }
        System.out.flush();
    }
}

