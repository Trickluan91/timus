package lab6;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1110">1110. Степень</a>
 */

public class Task1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n =  in.nextInt(), m = in.nextInt(), y = in.nextInt();
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                if(modPow(i, n, m) == y) {
                    result.add(i);
                }
            }

            out.println(result.isEmpty() ? "-1" : result.stream()
                    .map(Objects::toString)
                    .collect(Collectors.joining(" "))
            );
        } finally {
            in.close();
            out.flush();
        }
    }

    private static int modPow(int base, int exp, int mod) {
        long result = 1;
        long b = base % mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp /= 2;
        }

        return (int) result;
    }
}
