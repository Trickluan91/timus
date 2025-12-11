package lab4;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href='https://acm.timus.ru/problem.aspx?space=1&num=2023'>2023. Дональд-почтальон</a><br><br>
 */

public class Task2023 {
    private static final Map<String, Integer> closets = new HashMap<>();
    static {
        closets.put("Alice", 1); closets.put("Ariel", 1); closets.put("Aurora", 1);
        closets.put("Phil", 1); closets.put("Peter", 1); closets.put("Olaf", 1);
        closets.put("Phoebus", 1); closets.put("Ralph", 1); closets.put("Robin", 1);

        closets.put("Bambi", 2); closets.put("Belle", 2); closets.put("Bolt", 2);
        closets.put("Mulan", 2); closets.put("Mowgli", 2); closets.put("Mickey", 2);
        closets.put("Silver", 2); closets.put("Simba", 2); closets.put("Stitch", 2);

        closets.put("Dumbo", 3); closets.put("Genie", 3); closets.put("Jiminy", 3);
        closets.put("Kuzko", 3); closets.put("Kida", 3); closets.put("Kenai", 3);
        closets.put("Tarzan", 3); closets.put("Tiana", 3); closets.put("Winnie", 3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            in.nextInt();

            int moves = 0;
            int cursor = 1;

            while (in.hasNext()) {
                int closetNumber = closets.get(in.next());
                moves += Math.abs(cursor - closetNumber);
                cursor = closetNumber;
            }

            out.println(moves);
        } finally {
            in.close();
            out.flush();
        }
    }
}
