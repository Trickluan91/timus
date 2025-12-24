package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1654">1654. Шифровка</a>
 */

public class Task1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            char[] text =  in.nextLine().toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : text) {
                if(sb.length() != 0 && sb.charAt(sb.length()-1) == c){
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    sb.append(c);
                }
            }

            out.println(sb);
        } finally {
            in.close();
            out.flush();
        }
    }
}
