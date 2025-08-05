class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String newS = "";
        int cntZero = 0;
        int cntRepeat = 0;
        while(true) {
            for(String str:s.split("")) {
                if(str.equals("0")) {
                    cntZero++;
                } else {
                    newS += str;
                }
            }
            cntRepeat ++;
            s = Integer.toString(newS.length(), 2);
            if(s.equals("1")) {
                break;
            }
            newS = "";
        }
        answer[0] = cntRepeat;
        answer[1] = cntZero;
        return answer;
    }
}