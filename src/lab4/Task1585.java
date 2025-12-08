package lab4;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1585">1585. Пингвины</a><br><br>
 */

public class Task1585 {
    static private final Map<String, Integer> statistic = new HashMap<>();
    static {
        statistic.put("Emperor Penguin", 0);
        statistic.put("Little Penguin", 0);
        statistic.put("Macaroni Penguin", 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int penguins = in.nextInt();
            in.nextLine();
            for (int i = 0; i < penguins; i++) {
                statistic.computeIfPresent(in.nextLine(), (key, count) -> ++count);
            }

            out.println(Collections.max(statistic.entrySet(), Map.Entry.comparingByValue()).getKey());
        } finally {
            in.close();
            out.flush();
        }
    }
}
