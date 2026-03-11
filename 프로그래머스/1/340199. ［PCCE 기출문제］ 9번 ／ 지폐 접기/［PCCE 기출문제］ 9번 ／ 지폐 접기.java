class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int w = bill[0];
        int h = bill[1];
        
        while((w > wallet[0]) || (h > wallet[1])){
            if (w > h){
                w = w / 2;
                answer++;
            } else {
                h = h / 2;
                answer++;
            }
            if (w <= wallet[1] && h <= wallet[0]){
                break;
            }
        }
        // System.out.println(w <= wallet[0]);
        // System.out.println(h <= wallet[1]);
        return answer;
    }
}