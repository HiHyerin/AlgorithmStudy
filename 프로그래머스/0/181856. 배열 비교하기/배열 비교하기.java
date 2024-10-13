class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1Length = arr1.length;
        int a2Length = arr2.length;
        if(a1Length != a2Length) {
            answer = a1Length > a2Length ? 1 : -1;
        } else {
            int a1Sum = 0;
            int a2Sum = 0;
            for(int a : arr1) {
                a1Sum += a;
            }
            
            for(int a : arr2) {
                a2Sum += a;
            }
            if(a1Sum > a2Sum) {
                answer = 1;
            } else if(a1Sum < a2Sum) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}