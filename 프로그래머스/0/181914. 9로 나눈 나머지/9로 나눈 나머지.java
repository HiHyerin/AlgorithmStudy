class Solution {
    public int solution(String number) {
        int sum = 0;
        char[] chars = number.toCharArray();
        for(char c : chars) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum % 9;
    }
}