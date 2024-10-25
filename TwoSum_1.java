class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
        int output[] = new int[2];
        int complement;

        // in the intuitive two pass method, pass 1 is to put all the values into the map. Then find the complement and check if complement is withing the map

        for(int i=0; i<nums.length; i++)
        {
            complement = target-nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i)
            {
                output[0] = i;
                output[1] = numMap.get(complement);
            }
            numMap.put(nums[i], i);

            // in the one pass method, we first check if the complement is there, if not, just continue. We put the new value into the map anyways. If we dont find the partner the first time, no worries, we will find the original when we eventually loop till the the partner.
        }

        return output;
        
    }
}