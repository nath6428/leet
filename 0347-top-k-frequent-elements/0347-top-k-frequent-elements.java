import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,ArrayList<Integer>> frequencyTable = new HashMap<>();
        ArrayList<Integer> returnArrayList = new ArrayList<>();
        int[] returnList = new int[k];
        int counter = 0;
        

        for(int i = 1; i <= nums.length; i++){
            frequencyTable.put(i, new ArrayList<Integer>());
        }
            
            
        Arrays.sort(nums);
        int previous = nums[0];

        for(int num: nums){
            if(num == previous){
                counter++;
            } else{
                
                frequencyTable.get(counter).add(previous);
                counter = 1;
            }
            previous = num;
        }
        frequencyTable.get(counter).add(previous);
        Collection<ArrayList<Integer>> values = frequencyTable.values();
        List<ArrayList<Integer>> list = new ArrayList<>(values);

        for(int i = list.size() - 1; i > -1; i--){
            if(returnArrayList.size() < k){
                ArrayList<Integer> currentList = list.get(i);
                if(!currentList.isEmpty()){
                    for(int num: currentList){
                        returnArrayList.add(num);
                    }
                }
            }
        }

        for(int i = 0; i < returnArrayList.size(); i++){
            returnList[i] = returnArrayList.get(i);
        }

        return returnList;
    }
}