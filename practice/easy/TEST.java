package easy;
import java.util.Scanner;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/TEST
 * Result: Accepted
 * Time: 0.41s
 * Memory: 177.7M
 */

class TEST {

    public static void main(String args[]) {

        int i;
        Scanner sc=new Scanner(System.in);
        while(true) {
            
            if((i=sc.nextInt())!=42) {
                System.out.println(i);
            }
            else {
                break;
            }
        }
    }
}
