class Solution {
    public int search(int[] nums, int target) {
        
        if (nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        
        for(int i = 0; i < (int) Math.sqrt(nums.length) + 1; i++){
            
            int middle = (int) (right+left) / 2;
            if(target == nums[middle]){
                return middle;
            } else if(target < nums[middle]){
                right = middle - 1;
            } else if(target > nums[middle]){
                left = middle + 1;
            }
        }

        return -1;
    }
}