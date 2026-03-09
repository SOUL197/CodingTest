class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] sArr = s.toCharArray();
        char[] skArr = skip.toCharArray();
        
        for (int i=0; i<sArr.length; i++){
            int index1 = index;
            for (int j=0; j<index1; j++){
                sArr[i] = (char)(sArr[i]+1);
                if(sArr[i]>'z'){
                    sArr[i] = 'a';
                }
                for (int k=0; k<skArr.length; k++){
                    if(sArr[i] == skArr[k]){
                        index1++;
                    }
                }
            }
        }
        answer = new String(sArr);
        
        // for (char c : sArr){
        //     System.out.println(c);
        // }
        // System.out.println((char)((int)s.charAt(0)+index));
        return answer;
    }
}