class LeftRotateArrayByKPlaces {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // reverse the first k values
        reverse(nums, 0, k-1);
        // revere the all remaining values
        reverse(nums, k, n-1);
        // reverse all values together
        reverse(nums, 0, n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int value = nums[start];
            nums[start] = nums[end];
            nums[end] = value;
            start++;
            end--;
        }
    }
}