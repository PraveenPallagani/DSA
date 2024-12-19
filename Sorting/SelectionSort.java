class Solution {
    // Time Complexity : O(n^2)
    // Space Complexity: O(1)
    public int[] selectionSort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            // base condition
            return nums;
        }
        return  sortByFindingMinValue(nums);
        //return sortByFindingMaxValue(nums);
    }

    private int[] sortByFindingMinValue(int[] nums) {
        // selection sort algorithm using find min value
        for(int i=0;i < nums.length -1; i++) {
            int samllValueIndex = i;
            for(int j=i+1;j < nums.length; j++) {
                if(nums[j] < nums[samllValueIndex]) 
                    samllValueIndex = j;
            }
            swapTheValues(nums, i, samllValueIndex);
        }
        return nums;
    }

    private int[] sortByFindingMaxValue(int[] nums) {
        // selection sort algorithm using find max value
        for(int i=0;i < nums.length; i++) {
            int bigValueIndex = 0;
            for(int j=0;j < nums.length - i; j++) {
                if(nums[j]>nums[bigValueIndex]) 
                    bigValueIndex = j;
            }
            swapTheValues(nums, nums.length-1-i, bigValueIndex);
        }
        return nums;
    }

    private void swapTheValues(int[] nums, int ind1, int ind2) {
        int value = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = value;
    }
}