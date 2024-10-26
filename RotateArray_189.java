class Solution {
    public void rotate(int[] nums, int k) {
        // creating a new output array
        // making offset of k each time while replacing into the new array using mod

        int output[] = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            output[(i+k)%nums.length] = nums[i];
        }

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = output[i];
        }
    }
}