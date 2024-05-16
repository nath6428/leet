import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<Character>();
         HashMap<Character, Character> map = new HashMap<>();
        map.put(")".charAt(0), "(".charAt(0));
        map.put("}".charAt(0), "{".charAt(0));
        map.put("]".charAt(0), "[".charAt(0));

        if(s.length() % 2 == 1){
            return false;
        }

         for(char c: s.toCharArray()){
              
             if(map.containsKey(c)){
                 
                if(stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
             } else{
 
                 stack.push(c);
 
             }
         }
         return stack.isEmpty();
 
     }
 }