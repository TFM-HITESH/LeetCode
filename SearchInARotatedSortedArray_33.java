class Solution {
    public int search(int[] nums, int target) {

        // just do simple linear search

        // alternative is to do double binary search 
        // 1. find the rotation point (compare first element against mid, if first is larger, move high to mid and redo. if first is smaller, move first there and try again)
        // 2. with rotation point, split array into two
        // 3. merge the arrays back 
        // 4. find the element with binary search 
        // 5. return (i+k)%nums.length
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        
        return -1;
    }
}