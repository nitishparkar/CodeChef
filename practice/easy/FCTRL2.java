package easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/FCTRL2
 * Result: Accepted
 * Time: 0.42s
 * Memory: 177.6M
 */

class FCTRL2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            BigInteger res = BigInteger.ONE;
            for(int i=n;i>1;i--) {
                res=res.multiply(BigInteger.valueOf(i));
            }
            System.out.println(res);
        }
    }
}
