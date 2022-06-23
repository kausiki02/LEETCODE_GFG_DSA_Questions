// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   int i=0;
    public int[] sortedArrayToBST(int[] nums)
    {
        int arr[] = new int[nums.length];
        helper(arr, nums, 0, nums.length-1);
        return arr;
    }
    
    private void helper(int [] arr, int nums[], int l, int r){
        if(l>r) return;
        
        int mid = (l+r)/2;
        arr[i++]=nums[mid];
        helper(arr,nums,l,mid-1);
        helper(arr, nums, mid+1, r);
        
    }
}