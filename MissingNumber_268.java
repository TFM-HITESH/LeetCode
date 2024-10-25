class Solution {
    public int missingNumber(int[] nums) {

        // firstly sort the nums
        // we know that only 1 is missing. So iterate from 0 to n
        // when i is not equal to value in array, thats the missing value
        
        Arrays.sort(nums);

        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums.length;
    }
}