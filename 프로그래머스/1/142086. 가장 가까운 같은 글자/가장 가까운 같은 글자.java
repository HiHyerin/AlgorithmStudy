class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        for(int i=0; i<sArr.length; i++) {
            if(i != 0) {
                int n = 1;
                while(true) {
                    if(sArr[i].equals(sArr[i-n])) {
                        answer[i] = n;
                        break;
                    } else {
                        n ++;
                        if(i-n < 0) {
                            answer[i] = -1;
                            break;
                        }
                    }
                }
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}