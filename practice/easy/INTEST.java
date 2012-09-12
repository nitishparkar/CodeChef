package easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/INTEST
 * Result: Accepted
 * Time: 8.48s
 * Memory: 177.7M
 */

class INTEST {

    public static void main(String[] args) throws IOException {

        int n = CustomIO.nextPositiveInt();
        int k = CustomIO.nextPositiveInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (CustomIO.nextPositiveInt() % k == 0) {
                count++;
            }
        }
        CustomIO.pw.println(count);
        CustomIO.pw.flush();
    }
    
    static class CustomIO {
        private static BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        private static PrintWriter pw = new PrintWriter(System.out);
        private static StringBuilder sb = new StringBuilder();
        private static boolean[] digit = new boolean[58];
        private static boolean[] token = new boolean[128];
        static {
            for (int i = 48; i < 58; i++) {
                digit[i] = true;
            }
            token[' '] = token['\n'] = token['\t'] = true;
        }
        
        static int nextPositiveInt() throws IOException{
            int value;
            int cin = -1;
            while (true) {
                cin = br.read();
                if (digit[cin]) {
                    break;
                }
            }
            value = cin - 48;
            while (true) {
                cin = br.read();
                if (!digit[cin]) {
                    break;
                }
                value = value * 10 + (cin - 48);
            }
            return value;
        }
    }
}
