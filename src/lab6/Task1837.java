package lab6;

import java.io.PrintWriter;
import java.util.*;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1837">1837. Число Исенбаева</a>
 */

public class Task1837 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int teams = in.nextInt(); in.nextLine();
            Map<String, Set<String>> graph = new HashMap<>();
            for (int i = 0; i < teams; i++) {
                String[] team = in.nextLine().split(" ");

                for (String member : team) {
                    graph.putIfAbsent(member, new HashSet<>());
                }

                // Связываем всех участников команды друг с другом
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (j != k) {
                            graph.get(team[j]).add(team[k]);
                        }
                    }
                }
            }

            Map<String, Integer> distances = new HashMap<>();
            if (graph.containsKey("Isenbaev")) {
                Queue<String> queue = new LinkedList<>();
                queue.offer("Isenbaev");
                distances.put("Isenbaev", 0);

                while (!queue.isEmpty()) {
                    String current = queue.poll();
                    int currentDist = distances.get(current);

                    for (String neighbor : graph.get(current)) {
                        if (!distances.containsKey(neighbor)) {
                            distances.put(neighbor, currentDist + 1);
                            queue.offer(neighbor);
                        }
                    }
                }
            }

            List<String> participants = new ArrayList<>(graph.keySet());
            Collections.sort(participants);
            for (String participant : participants) {
                if (distances.containsKey(participant)) {
                    out.println(String.format("%s %d", participant, distances.get(participant)));
                } else {
                    out.println(String.format("%s undefined", participant));
                }
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
