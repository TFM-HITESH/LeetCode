class Solution {
    public int[] countBits(int n) {

        // keeping an array for the solutions (all the number of 1s in each number's binary repn)
        // have a counter that just goes thru the binary string and returns number of 1s
        // append that answer into the output array 

        int output[] = new int[n+1];

        for(int i=0; i<=n; i++)
        {
            String s = Integer.toBinaryString(i);
            output[i] = counter(s);
        }

        return output;

    }

    public static int counter(String s)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }

    
}