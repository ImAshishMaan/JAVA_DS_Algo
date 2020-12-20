class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int s = nums.length;
        for(Integer i : nums){
            set.add(i);
        }
        for(Integer i=1 ; i<=s ; i++){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        for(Integer i : set){
            list.add(i);
        }
        return list;
    }
}