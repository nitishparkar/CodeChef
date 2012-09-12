package challenges.$2012_02;
import java.io.*;
import java.util.*;

/**
 *
 * @author Nitish
 */

class MAXCOUNT
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();

            ArrayList<Integer> numsa=new ArrayList<Integer>();
            ArrayList<Nums> nums=new ArrayList<Nums>();

            for(int j=0;j<N;j++)
            {
                int tmp=sc.nextInt();
                if(numsa.contains(tmp))
                {
                    for(Nums a: nums)
                    {
                        if(a.number==tmp)
                        {
                            a.count+=1;
                            break;
                        }
                    }
                }
                else
                {
                    numsa.add(tmp);
                    nums.add(new Nums(tmp));
                }
            }

            Collections.sort(nums,new Nums());

            int maxn=0,countn=0;
            for(Nums a: nums)
            {
                if(a.count>countn)
                {
                    maxn=a.number;
                    countn=a.count;
                }
            }
            System.out.println(maxn+" "+countn);
        }
    }

}

class Nums implements Comparator<Nums>
{
    int number;
    int count;

    Nums(int num)
    {
        number=num;
        count=1;
    }

    Nums()
    {

    }

    public int compare(Nums o1, Nums o2)
    {
        return (o1.number-o2.number);
    }
}
