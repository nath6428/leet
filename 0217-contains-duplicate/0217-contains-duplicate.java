class Solution {
    public static boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> hash= new HashMap<Integer, Integer>();
        for(int num: nums){
            if(hash.get(num) != null){
                return true;
            } else{
                hash.put(num, 1);
            }
        }
        return false;
    }
}