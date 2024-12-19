class MergeSort {
    // Time Complexity: O(n*log(n))
    // Space Complexity: O(n)
    public int[] mergeSort(int[] nums) {
        if(nums==null || nums.length<=1) {
            // base condition
            return nums;
        }
        // merge sort clall
        sort(nums, 0, nums.length-1);
        return nums;
    }

    private void sort(int[] nums,int start, int end) {
        if(start>=end) return; // base conditon i.e not further division required
        // divide the array into 2 halfs
        int mid = (start+end)/2;
        sort(nums, start, mid);
        sort(nums, mid+1, end);
        // merge the 2 sub-arrays
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int l1 = mid-start+1;
        int l2 = end-mid;
        // create temporary arrays
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];

        int ind1 = 0;
        int ind2 = 0;
        // copy first sub-array data
        for(int i=0;i<l1;i++) {
            arr1[i] = nums[start+i];
        }
        // copy seond sub-array data
        for(int i=0;i<l2;i++){
            arr2[i] = nums[mid+1+i];
        }
        // compare and sort 2 sub-arrays
        int k = start;
        while(ind1 < l1 && ind2 < l2) {
            if(arr1[ind1]<arr2[ind2]) {
                nums[k] = arr1[ind1];
                ind1++;
            } else {
                nums[k] = arr2[ind2];
                ind2++;
            }
            k++;
        }
        // place remaining values from arr1
        while(ind1<l1) {
            nums[k++] = arr1[ind1++];
        }
        // place remaining values from arr2
         while(ind2<l2) {
            nums[k++] = arr2[ind2++];
        }

    }
}