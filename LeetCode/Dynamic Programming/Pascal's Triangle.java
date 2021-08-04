class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> llist = new ArrayList<>();
        if(numRows == 0)
            return llist;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        llist.add(firstrow);
        
        for(int i=1; i<numRows ; i++){
            List<Integer> prev = llist.get(i-1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            
            for(int j=1; j<i ; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            
            curr.add(1);
            llist.add(curr);
        }
        return llist;
    }
}