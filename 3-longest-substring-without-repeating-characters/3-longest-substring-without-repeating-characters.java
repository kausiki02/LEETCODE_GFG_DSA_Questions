class Solution {
    public int lengthOfLongestSubstring(String s) {
        //best optimised solution 
        //tc - O(n), Sc = O(n)
        
        HashMap<Character,Integer> ans = new HashMap<Character, Integer>();
        
        int left=0;
        int right =0;
        int n = s.length();
        int len = 0; //length of the longest substring
        
        while(right<n){
            if(ans.containsKey(s.charAt(right))){ // does our hashmap contains the character at index right if it contains we will update our left
                left = Math.max(ans.get(s.charAt(right))+1, left); //if that is in the range l to r that is in the right of left. Comparison between left and whatever we have seen at last+1 because
            }
            ans.put(s.charAt(right),right);//put the current character to the hashmap
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
        
    }
}