class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        
        int low = 0;
        int high = n-1;
        
        //binary search
        while(low <= high){
            int mid = low +  (high - low)/2;
            //if mid is a peak return
            if((mid == 0 || nums[mid-1] <= nums[mid]) && (mid == n-1 || nums[mid+1] <= nums[mid])){
                return mid;
            }
            
            else if(mid > 0 && nums[mid-1] > nums[mid]){
                high = mid - 1;
            }
            
            else{
                low = mid+1;
            }
        }
        
        return -1;
    }
}

//TC : O(nlogn)
//SC : O(1)