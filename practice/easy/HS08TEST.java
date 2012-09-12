package easy;
import java.util.Scanner;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/HS08TEST
 * Result: Accepted
 * Time: 3.17s
 * Memory: 177.7M
 */

class HS08TEST {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int cash=sc.nextInt();
        float balance=sc.nextFloat();

        if((cash%5)==0 && balance>=(cash+0.5)) {
            balance=balance-(float)cash-(float)0.5;
        }
        java.text.DecimalFormat df=new java.text.DecimalFormat(".00");
        System.out.println(df.format(balance));
    }
}