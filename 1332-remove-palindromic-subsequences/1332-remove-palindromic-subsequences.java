class Solution {
    public int removePalindromeSub(String s) {

//String length is 0 -> If the string length is 0, we can simply return 0.
//Entire string is a palindrome -> If the entire string is a palindrome, we can remove the whole string in single move. so in this case, we return 1.
//Entire string is not a palindrome -> If the given string is not an palindrome. Then first look at the first hint given above, the string only contains a's and b's. we can first remove all the a letter from the string in one move and then all the b letter in second move, and vice versa.
        
        if(s.length() == 0) return 0;
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) //checking if the string is palindrome or not
            {
                return 2;
            }
        }
        return 1;
    }
}