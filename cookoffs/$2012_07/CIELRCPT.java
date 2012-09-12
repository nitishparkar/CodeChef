package cookoffs.$2012_07;
import java.io.*;

/**
 *
 * @author Nitish
 */

class CIELRCPT {

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(;t>0;t--) {
            int p = Integer.parseInt(br.readLine());
            int cp = 0;
            int count = 0;
            for(int i=11; i>=0; i--){
                cp = (int)Math.pow(2,i);
                if(cp <= p){
                    p -= cp;
                    count++;
                    i++;
                }
                if(p==0){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
