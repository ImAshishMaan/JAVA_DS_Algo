import java.util.*;

class subsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] in = new char[3];
        for(int i= 0; i<in.length; i++){
            in[i] = sc.next().charAt(0);
        }
        ArrayList<String> myrec = new ArrayList<>();
        char[] out = new char[1000];
        sub(in, out, 0, 0,myrec);
        System.out.println(myrec.size());
        System.out.println(myrec);

    }
    public static void sub(char[] in, char[] out, int i, int j, ArrayList myrec){
        if(i == in.length){
            out[j] = '\0';
            String st = out.toString();
            myrec.add(out);
            System.out.println(out);
            return;
        }
        out[j] = in[i];
        sub(in, out, i+1, j+1, myrec);

        sub(in,out,i+1, j,myrec);
    }
}