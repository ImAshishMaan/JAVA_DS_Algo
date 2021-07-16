class Solution {
    public int numberOfSteps(int num) {
        int s = 0;
        while(num > 0){
            if(num%2 == 0){
                num = num >> 1;
                s++;
            }else{
                num = num ^ 1;
                s++;
            }
            
        }
        return s;
    }
}