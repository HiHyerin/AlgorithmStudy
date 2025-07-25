class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        for(String str : s.split("")) {
            if(str.equals("p")) {
                pCnt ++;
            } else if(str.equals("y")) {
                yCnt ++;
            }
        }
        if(pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}