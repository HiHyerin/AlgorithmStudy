class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] changeNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(direction.equals("right")){
                if(i == 0){
                    changeNumbers[i] = numbers[numbers.length - 1];
                } else {
                    changeNumbers[i] = numbers[i - 1];
                }
            } else {
                if(i == numbers.length - 1) {
                    changeNumbers[i] = numbers[0];
                } else {
                    changeNumbers[i] = numbers[i + 1];
                }
            }
        }
        return changeNumbers;
    }
}