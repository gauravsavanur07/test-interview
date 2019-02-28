import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n;
        n= scan.nextInt();
        ArrayList[] list = new ArrayList[20002];
        
        for(int i=1;i<n;i++){
            int x =scan.nextInt();
            list[i] = new ArrayList();
             for(int j=1;j<=x;j++){
                    int val = scan.nextInt();
                    list[i].add(val); 
             }
           

        }
        int q = scan.nextInt();
        for(int i=1;i<=q;i++){
            int x,y;
            x =scan.nextInt();
            y = scan.nextInt();
            try
              {
                System.out.println(list[x].get(y-1));
              }catch(Exception e)
              {
                  System.out.println("ERROR!");
              }

        }
    }
}

