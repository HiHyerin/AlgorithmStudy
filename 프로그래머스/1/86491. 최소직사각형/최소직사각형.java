class Solution {
    public int solution(int[][] sizes) {
        for (int[] size : sizes) {
            if(size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        }
        int xmax = 0;
        int ymax = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(xmax < sizes[i][0]) {
                xmax = sizes[i][0];
            }
            if(ymax < sizes[i][1]) {
                ymax = sizes[i][1];
            }
        }
        return xmax * ymax;
    }
}