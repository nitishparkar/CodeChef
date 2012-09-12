package challenges.$2012_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nitish
 */

class HORSES1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int min, n, d;
        int[] skills;
        
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            skills = new int[n];
            min = Integer.MAX_VALUE;
            String[] ip = br.readLine().split(" ");
            outer: for (int i = 0; i < n; i++) {
                skills[i] = Integer.parseInt(ip[i]);
                for (int j = 0; j < i; j++) {
                    d = difference(skills[i], skills[j]);
                    if (d < min) {
                        min = d;
                        if (min == 0) {
                            break outer;
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
    
    static int difference(int a, int b) {
        return Math.abs(a - b);
    }

}
