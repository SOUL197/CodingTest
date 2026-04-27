class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            while (a.length() < n) {
                a = "0".concat(a);
            }
            while (b.length() < n) {
                b = "0".concat(b);
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (a.charAt(j)=='0' && b.charAt(j)=='0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }

            answer[i] = sb.toString();
        }

        System.out.println(answer[1]);

        return answer;
    }
}