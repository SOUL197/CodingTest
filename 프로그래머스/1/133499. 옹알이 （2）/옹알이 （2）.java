class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pron = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            int idx = 0;
            String prev = "";
            boolean valid = true;
            
            while (idx < bab.length()) {
                boolean matched = false;
                
                for (String p : pron) {
                    if (bab.startsWith(p, idx)) {
                        if (p.equals(prev)) {
                            valid = false;
                            break;
                        }
                        
                        prev = p;
                        idx += p.length();
                        matched = true;
                        break;
                    }
                }
                
                if (!matched || !valid) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) answer++;
        }
        
        return answer;
    }
}