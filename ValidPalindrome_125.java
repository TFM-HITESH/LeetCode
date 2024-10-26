class Solution {
    public boolean isPalindrome(String s) {

        // first build the forward str string
        // then reverse that string
        // finally, check for equality

        // consider doing the same using two pointers
        // one pointer at start, one at end
        // if not alphanum, just move the pointer to next
        // if startptr == endptr, move both ahead and backwards
        // keep going, if at any point they fail, its not palindrome
        // stop when they both reach each other while(start<=end)
        
        String rev = "";
        String str = "";

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                str += s.charAt(i);
            }
        }

        for(int i=str.length()-1; i>=0; i--)
        {
            rev += str.charAt(i);
        }

        return str.equalsIgnoreCase(rev);
    }
}