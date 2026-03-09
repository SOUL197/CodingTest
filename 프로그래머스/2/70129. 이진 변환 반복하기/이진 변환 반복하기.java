class Solution {
    public int[] solution(String s) {
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        while (!s.equals("1")) {
            
            int oneCount = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    oneCount++;
                } else {
                    cnt2++;
                }
            }
            
            s = Integer.toBinaryString(oneCount);
            cnt1++;
        }
        
        return new int[]{cnt1, cnt2};
    }
}