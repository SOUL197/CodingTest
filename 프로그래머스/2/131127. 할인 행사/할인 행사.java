import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String, Integer> wish = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wish.put(want[i], number[i]);
        }
        HashMap<String, Integer> slideWindow = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            slideWindow.put(discount[i], slideWindow.getOrDefault(discount[i], 0) + 1);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            if (wish.equals(slideWindow)) {
                answer++;
            }

            if (i + 10 < discount.length) {
                String removeItem = discount[i];
                String addItem = discount[i + 10];

                slideWindow.put(removeItem, slideWindow.get(removeItem) - 1);
                if (slideWindow.get(removeItem) == 0) {
                    slideWindow.remove(removeItem);
                }

                slideWindow.put(addItem, slideWindow.getOrDefault(addItem, 0) + 1);
            }
        }

        // System.out.println(discount.length);
        return answer;
    }
}