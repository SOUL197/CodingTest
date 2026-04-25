import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> sizeCount = new HashMap<>();
        for (int i : tangerine) {
            sizeCount.put(i, sizeCount.getOrDefault(i, 0) + 1);
        }
        List<Integer> count = new ArrayList<>(sizeCount.values());
        count.sort((o1, o2) -> o2 - o1);

        int pack = 0;
        for (int c : count) {
            pack += c;
            answer++;
            if (pack >= k) {
                break;
            }
        }

        // System.out.println(count);
        
        return answer;
    }
}