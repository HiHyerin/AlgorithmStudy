class Solution {
    public String solution(String code) {
        char[] chars = code.toCharArray();
        String answer = "";
        int mode = 0;
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == '1') {
                mode = (mode == 1) ? 0 : 1;
            } else {
                if(mode == 1) {
                    if(i % 2 == 1) {
                        answer += chars[i];
                    }
                } else {
                    if(i % 2 == 0) {
                        answer += chars[i];
                    }
                }
            }
        }
        answer = answer.isEmpty() ? "EMPTY" : answer;
        return answer;
    }
}