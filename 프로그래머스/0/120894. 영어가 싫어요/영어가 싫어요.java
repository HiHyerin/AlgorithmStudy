class Solution {
    public long solution(String numbers) {
        String str = "";
        String engToNum = "";
        for(String s:numbers.split("")){
            str += s;
            switch (str) {
                case "one":
                    engToNum += "1";
                    str = "";
                    break;
                case "two":
                    engToNum += "2";
                    str = "";
                    break;
                case "three":
                    engToNum += "3";
                    str = "";
                    break;
                case "four":
                    engToNum += "4";
                    str = "";
                    break;
                case "five":
                    engToNum += "5";
                    str = "";
                    break;
                case "six":
                    engToNum += "6";
                    str = "";
                    break;
                case "seven":
                    engToNum += "7";
                    str = "";
                    break;
                case "eight":
                    engToNum += "8";
                    str = "";
                    break;
                case "nine":
                    engToNum += "9";
                    str = "";
                    break;
                case "zero":
                    engToNum += "0";
                    str = "";
                    break;
                default:
                    break;
            }
        }
        return Long.parseLong(engToNum);
    }
}