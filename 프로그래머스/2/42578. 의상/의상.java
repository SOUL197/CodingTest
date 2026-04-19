import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> classCount = new HashMap<>();
        for (String[] strings : clothes) {
            classCount.put(strings[1], classCount.getOrDefault(strings[1], 0)+1);
        }

        for (int count : classCount.values()) {
            answer = answer * (count + 1);
        }
        
        // System.out.println(classCount.get("headgear"));
        return answer - 1;
    }
}