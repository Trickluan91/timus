package lab4;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1924">1924. Четыре чертёнка</a><br><br>
 */

public class Task1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n =  in.nextInt();
            int mod = n % 4;
            out.println(mod == 0 || mod == 3 ? "black" : "grimy");
        } finally {
            in.close();
            out.flush();
        }
    }
}
