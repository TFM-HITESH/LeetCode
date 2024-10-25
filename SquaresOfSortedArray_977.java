class Solution {
    public int[] sortedSquares(int[] nums) {

        //first take all sqaures, then sort the final array
        // option 2 is to first take all abs values and then sort and then square

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}