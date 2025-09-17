class Solution {
    public String solution(String s, int n) {
        char[] c = s.toCharArray();
        String answer = "";
        for(int i=0; i<c.length; i++) {
            if(c[i] == ' ') {
                answer += ' ';
            }
            // 소문자 일 때
            else if(c[i] >= 97 && c[i] <= 122) {
                if((c[i] + n >= 97 && c[i] + n<= 122)) {
                    answer += (char) (c[i] + n);
                }
                // +n 했을 때 z가 넘을 경우 다시 a로 돌아가도록
                else {
                    answer += (char) (97 + c[i] + n - 123);
                }
            }
            // 대문자 일 때
            else {
                if ((c[i] + n >= 65 && c[i] + n<= 90)) {
                    answer += (char) (c[i] + n);
                } else {
                    answer += (char) (65 + c[i] + n - 91);
                }
            }
        }
        return answer;
    }
}