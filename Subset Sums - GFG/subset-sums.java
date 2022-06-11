// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    void func(int index, ArrayList<Integer>arr, int sum, int N, ArrayList<Integer> ans){
        //base case
        if(index == N){
            ans.add(sum);
            return;
        }
        //picking up the element
        func(index+1,arr,sum+arr.get(index),N,ans);
        
        //for not picking up the element
        func(index+1,arr,sum,N,ans);
    } 
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        func(0,arr,0,N,ans);
        Collections.sort(ans);
        return ans;
            
        }
    }