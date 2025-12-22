package lab6;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1563">1563. Баяны</a>
 */

public class Task1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int shopsC = in.nextInt(); in.nextLine();
            int skipped = 0;

            Set<String> shops = new HashSet<>();
            for (int i = 0; i < shopsC; i++) {
                String shop = in.nextLine();
                if(shops.contains(shop)) {
                    skipped++;
                } else {
                    shops.add(shop);
                }
            }

            out.println(skipped);
        } finally {
            in.close();
            out.flush();
        }
    }
}
