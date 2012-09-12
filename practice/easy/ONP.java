package easy;
import java.io.*;
import java.util.*;

/**
 *
 * @author Nitish Parkar
 *
 * Problem Statement: http://www.codechef.com/problems/ONP
 * Result: Accepted
 * Time: 0.43s
 * Memory: 177.8M
 */

class ONP {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk=new Stack<Character>();
        StringBuilder postfix;

        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            postfix=new StringBuilder();
            char[] ipstr=br.readLine().toCharArray();
            for(char ch:ipstr){
                if(Character.isLetter(ch)){
                    postfix.append(ch);
                    //System.out.println("L"+ch);
                }else if(ch=='('){
                    stk.push(ch);
                }else if(ch==')'){
                    while(true){
                        char tch=stk.pop();
                        if(tch=='('){
                            break;
                        }else{
                            postfix.append(tch);
                        }
                    }
                }else{
                    if(stk.isEmpty()||stk.peek()=='('){
                        stk.push(ch);
                    }else{
                        int chp=0,stp=0;
                        if(ch=='^'){
                            chp=2;
                        }else if(ch=='*'||ch=='/'){
                            chp=1;
                        }

                        while(true){
                            if(stk.isEmpty()||stk.peek()=='('){
                                stk.push(ch);
                                break;
                            }
                            char tch=stk.pop();
                            if(tch=='^'){
                                stp=2;
                            } else if (tch == '*' || tch == '/')
                            {
                                stp=1;
                            }else{
                                stp=0;
                            }
                            if(stp<chp){
                                stk.push(tch);
                                stk.push(ch);
                                break;
                            }else{
                                postfix.append(tch);
                                //
                                //break;
                            }
                        }
                        
                    }
                }
            }
            while(!stk.isEmpty()){
                char tch=stk.pop();
                if(tch!='('){
                    postfix.append(tch);
                }
            }

            System.out.println(postfix);
        }
    }
}
