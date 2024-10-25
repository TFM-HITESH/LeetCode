class Solution {
    public boolean isPalindrome(int x) {

        // discard negative numbers due to - sign
        // in case of positive, find the reverse using the mod trick

        if(x < 0)
        {
            return false;
        }
        else
        {
            if(x == rev(x))
            {
                return true;
            }
            return false;
        }
    }

    public int rev(int n)
    {
        int rev = 0;
        while (n > 0)
        {
            rev = rev*10 + n%10;
            n/=10;
        }

        return rev;
    }
}