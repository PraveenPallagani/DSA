class Solution {
    // Time Complexity : O(n^2)
    // Space Complexity: O(1)
    public int[] insertionSort(int[] nums) {
        if(nums==null || nums.length<=1){
            // base condition 
            return nums;
        }

        // start with smaller array and add one items each time and sort
        for(int i=1;i<nums.length;i++) {
            for(int j=i;j>0;j--) {
                if(nums[j-1] > nums[j]) {
                    swapTheValues(nums, j-1, j);
                }
            }
        }
        return nums;
    }

    private void swapTheValues(int[] nums,int i, int j) {
        int value = nums[i];
        nums[i] = nums[j];
        nums[j] = value;
    }
}