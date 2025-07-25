class Solution {
    public boolean solution(int x) {
        String xStr = String.valueOf(x);
        int sum = 0;
        for(String str: xStr.split("")) {
            sum += Integer.parseInt(str);
        }
        if(x%sum == 0) {
            return true;
        }
        return false;
    }
}