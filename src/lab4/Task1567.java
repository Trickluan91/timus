package lab4;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1567">1567. SMS-спам</a><br><br>
 */

public class Task1567 {
    public static Map<Character, Integer> cost = new HashMap<>();
    static {
        cost.put('a', 1); cost.put('d', 1); cost.put('g', 1); cost.put('j', 1);
        cost.put('m', 1); cost.put('p', 1); cost.put('s', 1); cost.put('v', 1);
        cost.put('y', 1); cost.put('.', 1); cost.put(' ', 1);

        cost.put('b', 2); cost.put('e', 2); cost.put('h', 2); cost.put('k', 2);
        cost.put('n', 2); cost.put('q', 2); cost.put('t', 2); cost.put('w', 2);
        cost.put('z', 2); cost.put(',', 2);

        cost.put('c', 3); cost.put('f', 3); cost.put('i', 3); cost.put('l', 3);
        cost.put('o', 3); cost.put('r', 3); cost.put('u', 3); cost.put('x', 3);
        cost.put('!', 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            String s = in.nextLine();
            int result = 0;

            for (Character c : s.toCharArray()) {
                result += cost.get(c);
            }

            out.println(result);
        } finally {
            in.close();
            out.flush();
        }
    }
}
