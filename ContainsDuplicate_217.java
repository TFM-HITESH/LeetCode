class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        // add all the elements into hashmap. 
        // keep checking if it already exists in the hashmap. If yes, break and return true (duplicate)
        // if never found, then return true

        for(int i=0; i<nums.length; i++)
        {
            if(h.containsKey(nums[i]))
            {
                return true;
            }
            h.put(nums[i], 0);
        }
        return false;
    }
}