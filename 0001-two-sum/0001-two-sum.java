class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            hash.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(hash.get(target - nums[i]) != null){
                if(hash.get(target - nums[i]) != i){
                    result[0] = i;
                    result[1] = hash.get(target - nums[i]);
                    return result;
                }
                
            }

        }
        return result;
    }
}