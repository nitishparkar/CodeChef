package easy;
import java.io.*;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/TEST
 * Result: Accepted
 * Time: 0.31s
 * Memory: 177.3M
 */

class TEST_PW {

    public static void main(String[] args) throws IOException {

        int i;
        while (true) {
            i = CustomIO.nextPositiveInt();
            if (i != 42) {
                CustomIO.pw.println(i);
            } else {
                break;
            }
        }
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
