package challenges.$2012_11;

import java.io.*;
/**
 *
 * @author nitish
 */
class CONFLIP1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int g = Integer.parseInt(br.readLine());
            while(g-- > 0) {
                String[] st = br.readLine().split(" ");
                int[] tc = new int[3];
                for(int i = 0; i < 3; i++ ) {
                    tc[i] = Integer.parseInt(st[i]);
                }
                if(tc[1] % 2 == 0) {
                    System.out.println(tc[1]/2);
                } else {
                    if (tc[0] == tc[2]) {
                         System.out.println((tc[1]-1)/2);
                    } else {
                        System.out.println((tc[1]+1)/2);
                    }
                }
                
            }
        }
    }
}
