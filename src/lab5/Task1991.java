package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1991">1991. Битва у болота</a>
 */

public class Task1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int blocks = in.nextInt(), droids = in.nextInt();
            int unused = 0, survived = 0;

            for (int i = 0; i < blocks; i++) {
                int resultBattle = droids - in.nextInt();
                if(resultBattle > 0) {
                    survived += resultBattle;
                } else {
                    unused += resultBattle;
                }
            }

            out.println(String.format("%d %d", Math.abs(unused), survived));
        } finally {
            in.close();
            out.flush();
        }
    }
}
