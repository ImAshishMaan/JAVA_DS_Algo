package Recursion_Challenges;

import java.util.*;

class BoardPath{
    public static void main(String args[]){
        System.out.println(getbaredPath(0,10));
    }
    public static ArrayList<String> getbaredPath(int curr, int end){
        if(curr == end){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        if(curr > end){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> mr = new ArrayList<>();
        for(int dice=1; dice<=6 ; dice++){
            ArrayList<String> rr = getbaredPath(dice + curr, end);

            for(String r : rr){
                mr.add(dice+r);
            }
        }
        return mr;
    }
}