class BubbleSort {
    // Time Complexity : O(n^2)
    // Space Complexity: O(1)
    public int[] bubbleSort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            // base condition
            return nums;
        }
        // bubleUpBigValue(nums);
        bubleDownSmallValue(nums);
        return nums;
    }

    private void bubleUpBigValue(int[] nums) {
        // easier way
        for(int i=0;i < nums.length; i++) {
            for(int j = 1; j < nums.length -i; j++) {
                if(nums[j-1] > nums[j]) {
                    swapTheValues(nums, j-1, j);
                }
            }
        }
    }

    private void bubleDownSmallValue(int[] nums) {
        // complex way
        for(int i= nums.length-1;i >= 0; i--) {
            for(int j = nums.length-2; j >= nums.length-1-i; j--) {
                if(nums[j] > nums[j+1]) {
                    swapTheValues(nums, j, j + 1);
                }
            }
        }
    }

    private void swapTheValues(int[] nums, int i,int j) {
        int value = nums[i];
        nums[i] = nums[j];
        nums[j] = value; 
    }
}