class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int max = 1;
        for(int i=1; i<=a; i++) {
            if(a%i == 0 && b%i == 0) {
                if(max < i) {
                    max = i;
                }
            };
        }
        if(max != 1) {
            a = a/max;
            b = b/max;
        }
        while(true) {
            if(b%5 == 0) {
                b = b/5;
            } else if(b%2 == 0) {
                b = b/2;
            } else {
                break;
            }
        }
        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}