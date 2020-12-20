class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(Integer n : nums){
            if(list.contains(n)){
                list.remove(n);
            }else{
                list.add(n);
            }
        }
        return list.get(0);
    }
}