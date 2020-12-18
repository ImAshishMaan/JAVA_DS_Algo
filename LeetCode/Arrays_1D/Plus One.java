class Solution {
    public int[] plusOne(int[] digits) {
        int s = digits.length;
        for(int i=digits.length-1 ; i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] dd = new int[digits.length+1];
        dd[0] = 1;
        return dd;
    }
}