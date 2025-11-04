class Solution {
    public String solution(String polynomial) {
        String answer ="";
        int xSum = 0;
        int numSum = 0;
        String[] polyArray = polynomial.replaceAll(" ", "").split("\\+");
        for(String s : polyArray) {
            if(s.endsWith("x")) {
                xSum += Integer.parseInt(s.length() == 1 ? "1" : s.substring(0, s.length() - 1));
            } else {
                numSum += Integer.parseInt(s);
            }
        }
        String x = xSum == 1 ? "" : String.valueOf(xSum);
        if(numSum == 0) {
            answer = x + "x";
        } else if(xSum == 0) {
            answer += numSum;
        } else {
            answer = x + "x" + " + " + numSum;
        }
        return answer;
    }
}