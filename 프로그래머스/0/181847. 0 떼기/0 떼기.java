class Solution {
    public String solution(String n_str) {
        int idx = 0;
        for(char s : n_str.toCharArray()){
            if(s != '0') {
                idx = n_str.indexOf(s);
                break;
            }
        }
        return n_str.substring(idx);
    }
}