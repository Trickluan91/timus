package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=2025">2025. Стенка на стенку</a>
 */

public class Task2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int tests = in.nextInt();
            for (int i = 0; i < tests; i++) {
                int fighters = in.nextInt(), teams =  in.nextInt();

                int minSz = fighters / teams;  // размер маленькой команды
                int maxSz = fighters % teams;  // сколько команд будут на 1 больше

                // maxSz команд размера (minSz+1), каждый боец дерется с (fighters-minSz-1) бойцами
                long fightsFromBigTeams = (long) maxSz * (minSz + 1) * (fighters - minSz - 1);

                // (teams-maxSz) команд размера minSz, каждый боец дерется с (fighters-minSz) бойцами
                long fightsFromSmallTeams = (long) (teams - maxSz) * minSz * (fighters - minSz);

                // Делим на 2, т.к. каждую схватку считали дважды
                out.println((fightsFromBigTeams + fightsFromSmallTeams) / 2);
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
