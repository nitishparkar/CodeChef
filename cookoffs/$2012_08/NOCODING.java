package cookoffs.$2012_08;
import java.io.*;

/**
 *
 * @author Nitish
 */

class NOCODING {
    
    public static void main(String args[]) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int prev=0,ch=0,n=0,count=0;
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            ch = 0;
            n = 11;
            count = 2; // initial load and print first character
            prev=br.read();
            while((ch=br.read())!=10){
                if(prev<ch){
                    count += ch - prev;
                }else if(prev>ch){
                    count += 26 - prev + ch;
                }
                prev = ch;
                count++;
                n+=11;
            }
            if(count<=n){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.flush();
    }
}
