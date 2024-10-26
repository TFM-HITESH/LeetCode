class Solution {
    public void sortColors(int[] nums) {

        // since there are only 3 possible colours, find the count of each type
        // then start replacing the array for those number of counts with that colour
        
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                redCount++;
            }
            if(nums[i] == 1)
            {
                whiteCount++;
            }
            if(nums[i] == 2)
            {
                blueCount++;
            }
        }

        System.out.println(redCount + " " + whiteCount + " " + blueCount);

        for(int i=0; i<redCount; i++)
        {
            nums[i] = 0;
        }
        for(int i=redCount; i<redCount + whiteCount; i++)
        {
            nums[i] = 1;
        }
        for(int i=redCount + whiteCount; i< redCount + whiteCount + blueCount; i++)
        {
            nums[i] = 2;
        }
    }
}