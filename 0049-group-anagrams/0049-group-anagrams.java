class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> returnList = new ArrayList<>();
        HashMap<String, Integer> anagramMap = new HashMap<String, Integer>();

        for(String s: strs){
            char[] stringList = s.toCharArray();
            Arrays.sort(stringList); //problem
            String sorted = String.valueOf(stringList);
            if(anagramMap.get(sorted) == null){
                anagramMap.put(sorted, returnList.size());
                ArrayList<String> newAnagramList = new ArrayList<>();
                newAnagramList.add(s);
                returnList.add(newAnagramList);
            } else{
                int index = anagramMap.get(sorted);
                returnList.get(index).add(s);
            }
        }
        

        return returnList;
    }
}