class Solution {
    public int search(int[] nums, int target) {

        // moving low and high according to mid
        // if target is bigger than mid, move low up
        // if target is smaller tha mid, move high down

        int low = 0;
        int high = nums.length-1;
        int mid = (int)((low + high)/2);

        while(low <= high)
        {
            if(target < nums[mid])
            {   
                high = mid - 1;
                mid = (int)((low + high)/2);
            }
            else if(target > nums[mid])
            {
                low = mid + 1;
                mid = (int)((low + high)/2);
            }
            else if(target == nums[mid])
            {
                return mid;
            }
        }

        return -1;

    }
}