/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        // if only 1 version, its bad.
        // doing binary search
        // if mid version itself is coming bad, then set badVersion to that and move high to before that (since bad version can be behind)
        // if its not bad, the bad version must be ahead and so set low to be mid + 1
        // keep going, evenetually while going backwards, you will find the situation where it wont be bad
        
        if(n==1)
        {
            return n;
        }

        int low = 1;
        int high = n;
        int mid;
        int badVersion = 1;

        while(low <= high)
        {
            mid = low + (high - low)/2;

            if(isBadVersion(mid))
            {
                badVersion = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return badVersion;
    }
}