class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
        int output[] = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            numMap.put(nums[i], i);
        }

        int complement;
        for(int i=0; i<nums.length; i++)
        {
            complement = target-nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i)
            {
                output[0] = i;
                output[1] = numMap.get(complement);
            }
        }

        return output;
        
    }
}