class Solution {
    boolean solution(String s) {
        int q = 0;
        int p = 0;
        for(String str:s.split("")) {
            if(q == p && str.equals(")")) {
                return false;
            }
            if(str.equals("(")){
                q++;
            } else {
                p++;
            }
        }
        if(s.startsWith(")") || s.endsWith("(") || q!=p) {
            return false;
        }

        return true;
    }
}