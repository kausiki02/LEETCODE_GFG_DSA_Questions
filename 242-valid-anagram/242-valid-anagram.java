class Solution {
    public boolean isAnagram(String s, String t) {
         
            
            // this takes current character from each string subtracts
            //a to get index of that current character in the alphabet 
            //and then it increments for the above.
    
        
        if(s.length()!=t.length()){
            return false;
        }
        
        int char_counts[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }
        
        for(int i : char_counts){
            if(i!=0){
                return false;
            }
        }
        return true;
        
        
            
       
        
        
        
        
        
        
        
        
        
        
    }
}