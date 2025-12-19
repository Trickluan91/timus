package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1607">1607. Такси</a>
 */

public class Task1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int petya = in.nextInt();
            int petyaAdd = in.nextInt();
            int taxi = in.nextInt();
            int taxiAdd = in.nextInt();

            if(petya >= taxi) {
                out.println(petya);
                return;
            }

            while (petya < taxi) {
                if (petya + petyaAdd > taxi) {
                    petya = taxi;
                    break;
                }
                petya += petyaAdd;

                if (taxi - taxiAdd < petya) break;
                taxi -= taxiAdd;
            }

            out.println(petya);
        } finally {
            in.close();
            out.flush();
        }
    }
}
