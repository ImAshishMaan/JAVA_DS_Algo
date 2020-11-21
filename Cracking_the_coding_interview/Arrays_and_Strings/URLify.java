// Q: Write a method to replace all spaces with '%20'. You may assure that string has sufficient spaces at the end to hold the additional characters,
//    and that you are given the "true" length of the string.(Note: if implementing in java please use a character array so that you can perform this
//    operation in place.)
package Arrays_and_Strings;

import java.util.*;

class URLify{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int truelength = sc.nextInt();
        char[] str = s.toCharArray();

        int spaceCount = 0, index = 0;
        for(int i=0 ; i<truelength; i++){    // to count number of spaces
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        index = truelength + spaceCount * 2;  //required space in new char array
        if(truelength < str.length)
            str[truelength] = '\0';

        char[] st = new char[index];     // new char array to store final result

        for(int i = truelength-1 ; i >= 0 ; i--){
            if(str[i]== ' '){
                st[index-1] = '0';
                st[index-2] = '2';
                st[index-3] = '%';
                index = index - 3;
            }
            else{
                st[index-1] = str[i];
                index--;
            }
        }
        System.out.println(st);
    }
}