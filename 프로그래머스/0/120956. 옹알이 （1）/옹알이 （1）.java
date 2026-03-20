class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] pron = {"aya","ye","woo","ma"};
        for (String bab : babbling){
            for (String p : pron){
                bab = bab.replace(p," ");
            }
            if (bab.trim().equals("")){
                answer++;
            }
        }
        
        System.out.println("yee".replace("ye",""));
        
        return answer;
    }
}