class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int st = s.length();
        int right = 0;
        int left = 0;
        int len = 0;
        while(right < st){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}