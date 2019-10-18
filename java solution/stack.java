import java.util.*;
import java.io.*;
import java.lang.*;
class GfG {
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t>0){
        MyStack obj = new MyStack();
        int Q = Integer.parseInt(read.readLine());
        int k = 0;
        String str[] = read.readLine().trim().split(" ");
        // 1 3 1 2 2 1 3
        while(Q>0){
            int QueryType = 0;
            QueryType = Integer.parseInt(str[k++]);
            if(QueryType == 1){
                int a = Integer.parseInt(str[k++]);
                
                obj.push(a);
                
            }else if(QueryType == 2){
            System.out.print(obj.pop()+" ");
            }
            Q--;
        }
        System.out.println("");
        t--;
        }
    }
}


/*This is a function problem.You only need to complete the function given below*/
/* You need to add code for functions 
    push() and pop() */
class MyStack{
    int top;
    int arr[] = new int[1000];
    MyStack(){
        top = -1;
    }
    
    /* The method push to push element
        into the stack */
    void push(int a){
        top++;
        arr[top] = a;
    } 
    
    /* The method pop which return 
        the element poped out of the stack*/
    int pop(){
        if(top == -1){
            return -1;
        }else{
            return arr[top--];
        }
    }
}