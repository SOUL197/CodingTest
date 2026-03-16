import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public ArrayList solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for (String[] p : photo){
            int a = 0;
            for (String n : p){
                if (map.containsKey(n)){
                    a += map.get(n);
                }
            }
            answer.add(a);
        }
        
        // System.out.println(map.containsKey("may"));
        return answer;
    }
}