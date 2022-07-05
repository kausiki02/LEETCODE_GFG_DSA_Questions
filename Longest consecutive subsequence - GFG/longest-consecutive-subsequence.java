// { Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   /*Arrays.sort(arr);
	   
	   int ans =0; int count =0;
	   ArrayList<Integer> a = new ArrayList<Integer>();
	   
	   
	   for(int i=1; i<N; i++){
	       if(arr[i] != arr[i-1]){//removing duplicate elements
	           a.add(arr[i]);
	       }
	       
	   }
	   //check whether they are consecutive or not 
	   for(int i=0; i<N; i++){
	       if(i>0 && a.get(i) == a.get(i-1)+1)
	            count++;
	       else 
	            count=1;
	       
	       ans = Math.max(ans,count);
	   }
	   return ans; */
	   
	   
	   Arrays.sort(arr);
  
        int ans = 0, count = 0;
       
        
        
        // Insert repeated elements 
        // only once in the vector
        for (int i = 1; i < N; i++) 
        {
            if (arr[i] == arr[i-1]+1)
                count++;
            else if(arr[i-1] == arr[i]){
                continue;
            }
            else{
                count=0;
            }
        
            ans = Math.max(ans,count);
        }
        
        return ans+1;
     
  
        
	}
}