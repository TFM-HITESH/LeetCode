class Solution {
    public int hammingWeight(int n) {

         // have a counter that just goes thru the binary string and returns number of 1s
        // append that answer into the output array 
        
        String s = Long.toBinaryString(n);
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