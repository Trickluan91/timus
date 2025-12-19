package lab5;

import java.io.PrintWriter;
import java.util.*;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1496">1496. Спамер</a>
 */

public class Task1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int submits = in.nextInt();
            Map<String, Integer> teams = new HashMap<>();

            for (int i = 0; i < submits; i++) {
                String team = in.next();
                teams.put(team, teams.getOrDefault(team, 0) + 1);
            }

            teams.forEach((team, teamSubmits) -> { if(teamSubmits > 1) out.println(team); });
        } finally {
            in.close();
            out.flush();
        }
    }
}
