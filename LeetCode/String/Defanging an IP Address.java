class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}


//class Solution {
//    public String defangIPaddr(String address) {
//        String ans = "";

//       char[] s = address.toCharArray();
//        for(int i=0 ; i<s.length ; i++){
//            if(s[i] == '.'){
//                ans = ans + '[' + s[i] + ']';
//           }else{
//               ans = ans + s[i];
//            }
//       }
//        return ans;
//    }
//}
