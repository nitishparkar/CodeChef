package challenges.$2012_07;
import java.io.*;

/**
 *
 * @author Nitish
 */

class SAD {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[]=br.readLine().split(" ");
        int r=Integer.parseInt(st[0]);
        int c=Integer.parseInt(st[1]);
        int chigh[]=new int[c];
        int rlow[]=new int[r];

        for(int i=0;i<c;i++){
            chigh[i] = 0;
        }

        for(int i=0;i<r;i++){
            st=br.readLine().split(" ");
            int rowmin = Integer.MAX_VALUE;
            int temp = 0;
            for(int j=0;j<c;j++){
                temp = Integer.parseInt(st[j]);
                if(temp < rowmin){
                    rowmin=temp;
                }
                if(chigh[j]<temp){
                    chigh[j]=temp;
                }
            }
            rlow[i]=rowmin;
        }

        boolean found=false;
        outer:for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rlow[i] == chigh[j]){
                    System.out.println(rlow[i]);
                    found = true;
                    break outer;
                }
            }
        }

        if(!found){
            System.out.println("GUESS");
        }

    }
}
