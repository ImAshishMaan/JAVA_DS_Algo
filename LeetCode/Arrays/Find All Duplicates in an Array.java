class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(Integer i:nums){
            if(!map.containsKey(i)){
                map.put(i,true);
            }else{
                list.add(i);
            }
        }
        return list;
    }
}


//class Solution {
//    public List<Integer> findDuplicates(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
//        for(Integer i: nums){
//            set.add(i);
//        }
//        for(Integer i : nums){
//            if(set.contains(i)){
//                set.remove(i);
//            }else{
//                list.add(i);
//            }
//        }
//        return list;
//    }
//}