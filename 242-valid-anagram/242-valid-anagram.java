class Solution {
    public boolean isAnagram(String s, String t) {
      /*  //if(s.length()!=t.length()) return false;
        
        int[] char_counts = new int[26];
        
        for(int i=0; i<s.length(); i++){
            
            char_counts[s.charAt(i)-'a']++; 
            
            // this takes current character from each string subtracts
            //a to get index of that current character in the alphabet 
            //and then it increments for the above.
        }
            
        for(int i=0; i<t.length(); i++){ 
            char_counts[s.charAt(i)-'a']--; // and decrements for this   
        }
        
        for(int i: char_counts){
            if(i!=0){
                return false;
            }
        }
        return true; */
        
        
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
        
        
        
        
        
        
        
        
        
        
    }
}