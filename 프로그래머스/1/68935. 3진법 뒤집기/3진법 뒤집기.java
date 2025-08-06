class Solution {
    public int solution(int n) {
        StringBuilder n3 = new StringBuilder(Integer.toString(n,3));
        String reverse = n3.reverse().toString();
        return Integer.parseInt(reverse,3);
    }
}