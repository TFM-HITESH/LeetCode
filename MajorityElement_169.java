class Solution {
    public int majorityElement(int[] nums) 
    {
        // firstly iterate through all the elements and create a hashmap of element : count
        // then go through all the counts and see if any of them are majority

        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        int major = (int)nums.length/2;
        int x;

        for(int i=0; i<nums.length; i++)
        {
            if(numMap.containsKey(nums[i]))
            {
                
                x = numMap.get(nums[i]);
                numMap.replace(nums[i], ++x );
            }
            else
            {
                numMap.put(nums[i], (Integer)(1));
            }
        }

        for(int i : numMap.keySet())
        {
            if(numMap.get(i) > major)
            {
                return i;
            }
        }

        return -1;
    }
}