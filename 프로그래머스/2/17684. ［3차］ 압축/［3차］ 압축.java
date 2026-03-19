import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String,Integer> dict = new HashMap<>();
        for (int i=1; i<27; i++){
            dict.put((char)(64+i)+"",i);
        }
        
        int idx = 27;
        for (int i=0; i<msg.length(); i++){
            String word = "";
            
            while (i<msg.length() && dict.containsKey(word + msg.charAt(i))){
                word += msg.charAt(i);
                i++;
            }
            
            answer.add(dict.get(word));
            
            if (i<msg.length()){
                dict.put(word+msg.charAt(i), idx);
                idx++;
                i--;
            }
        }
        
        // System.out.println(dict.get("Z"));
        
        return answer;
    }
}