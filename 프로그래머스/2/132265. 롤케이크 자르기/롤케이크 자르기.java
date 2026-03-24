import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer, Integer> cheol = new HashMap<>();
        HashSet<Integer> bro = new HashSet<>();
        
        for (int t : topping) {
            cheol.put(t, cheol.getOrDefault(t, 0) + 1);
        }
        
        for (int t : topping) {
            bro.add(t);
            
            cheol.put(t, cheol.get(t) - 1);
            if (cheol.get(t) == 0) {
                cheol.remove(t);
            }
            
            if (bro.size() == cheol.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}