// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);


            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    class Point implements Comparable<Point>{
        int key;
        int value;
        public Point(int key,int value){
            this.key = key;
            this.value = value;
        }
        
        public int compareTo(Point p){
           if(p.key != this.key) return p.key-this.key;
           return this.value-p.value;
        }
    }
    
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int[] res = new int[k];
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++){
            if(arr[i]!=x) pq.add(new Point(Math.abs(arr[i]-x),arr[i]));
            if(pq.size()>k) pq.poll();
        }
        
        int i = k-1;
        while(!pq.isEmpty()){
            res[i] = pq.poll().value;
            i--;
        }
        
        return res;
    }
}