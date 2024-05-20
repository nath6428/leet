class Solution {
    public static boolean isPalindrome(String s) {
        
      int len = s.length();
      ArrayList<Character> charList = new ArrayList<>();  

      if(len == 0 || len == 1){
        return true;
      }

      for(char c: s.toLowerCase().toCharArray()){
        if(Character.isAlphabetic(c) || Character.isDigit(c)){
            charList.add(c);
        }
      }

      len = charList.size();

      for(int i = 0; i < (int)(len/2); i++){
        if(charList.get(i) != charList.get(len-i-1)){
            return false;
        }
      }

      return true;

      
        
    }
}