class Solution {
    public int[] solution(int[] numlist, int n) {
        // 버블 정렬
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = 0; j < numlist.length - 1 - i; j++) {
                int dist1 = Math.abs(numlist[j] - n);
                int dist2 = Math.abs(numlist[j + 1] - n);

                // 정렬 조건: 거리가 더 큰 게 뒤로
                // 거리가 같으면 작은 게 뒤로 (즉, 큰 수가 앞으로)
                if (dist1 > dist2 || (dist1 == dist2 && numlist[j] < numlist[j + 1])) {
                    int temp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = temp;
                }
            }
        }
        return numlist;
    }
}