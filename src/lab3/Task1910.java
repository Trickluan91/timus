package lab3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1910">Руины титанов: сокрытый вход</a><br><br>
 */

public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int a = in.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }

            int maxSum = 0;
            int maxMid = 1;

            for (int i = 2; i < a; i++) {
                int sum = arr[i] + arr[i - 1] + arr[i - 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxMid = i;
                }
            }

            out.println(String.format("%d %d", maxSum, maxMid));
        } finally {
            in.close();
            out.flush();
        }
    }
}
