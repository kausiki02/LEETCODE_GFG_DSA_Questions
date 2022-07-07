// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}

// } Driver Code Ends


class Solution
{
    public static PriorityQueue<Integer> firstHalf= new PriorityQueue<Integer>((a,b) -> b-a);
    public static PriorityQueue<Integer> secondHalf = new PriorityQueue<>();
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
        if(firstHalf.isEmpty() || x<=firstHalf.peek()){
           firstHalf.add(x);
       }
       else{
           secondHalf.add(x);
       }
       
       balanceHeaps();
        
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       
       if(secondHalf.size()>firstHalf.size()){
           firstHalf.add(secondHalf.poll());
       }
       
       else if(firstHalf.size()> secondHalf.size()+1){
           secondHalf.add(firstHalf.poll());
       }
       
       getMedian();
       
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        if(firstHalf.size()==secondHalf.size()){
            return (double) (firstHalf.peek() + secondHalf.peek())/2;
        }
        else{
            return (double) (firstHalf.peek());
        }
        // add your code here
    }
    
}