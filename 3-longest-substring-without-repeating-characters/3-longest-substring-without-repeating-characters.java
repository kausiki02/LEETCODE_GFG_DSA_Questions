class Solution {
    public int lengthOfLongestSubstring(String s) {
        //optimised solution 1
        //tc - O(2n), Sc = O(n)
        
        HashSet<Character> ans = new HashSet<Character>();
        
        int left=0;
        int right =0;
        int n = s.length();
        int len = 0; //length of the longest substring
        
        while(right<n){
            if(!ans.contains(s.charAt(right))){
                ans.add(s.charAt(right));
                right++;
                len= Math.max(ans.size(),len);
            }
            else{
                ans.remove(s.charAt(left));
                left++;
            }
        }
        return len;
        
        
    }
}