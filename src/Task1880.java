import java.io.PrintWriter;
import java.util.*;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1880">1880. Собственные числа Psych Up</a><br><br>
 */

public class Task1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            Map<Integer, Integer> uniqueDigits = new HashMap<>();
            while (in.hasNext()) {
                int digitsByMan =  in.nextInt();
                for (int i = 0; i < digitsByMan; i++) {
                    uniqueDigits.compute(in.nextInt(), (k, v) -> v == null ? 1 : v + 1);
                }
            }
            int answer = 0;
            for (Integer value : uniqueDigits.values()) {
                if (value == 3) { answer++; }
            }

            out.println(answer);
        } finally {
            in.close();
            out.flush();
        }
    }
}
