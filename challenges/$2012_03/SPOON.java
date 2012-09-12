package challenges.$2012_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nitish
 */

class SPOON {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(;t>0;t--) {
            boolean found=false;
            String st=br.readLine();
            String str[]=st.split(" ");
            int r=Integer.parseInt(str[0]);
            int c=Integer.parseInt(str[1]);
            char[][] matrix=new char[r][c];
            
            for(int i=0;i<r;i++) {
                st=br.readLine().toLowerCase();
                if(st.contains("spoon")){
                    found=true;
                    continue;
                }
                matrix[i]=st.toCharArray();
            }

            if(!found) {
                for(int i=0;i<=r-5;i++) {
                    for(int j=0;j<c;j++) {
                        if((matrix[i][j]=='s')&&(matrix[i+1][j]=='p')&&(matrix[i+2][j]=='o')&&(matrix[i+3][j]=='o')&&(matrix[i+4][j]=='n')){
                            found=true;
                            break;
                        }
                    }
                }
            }

            if(found) {
                System.out.println("There is a spoon!");
            }
            else{
                System.out.println("There is indeed no spoon!");
            }
        }
    }
}
