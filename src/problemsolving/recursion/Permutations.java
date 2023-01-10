package problemsolving.recursion;

public class Permutations {
    static void printPermutations(String str,int l,int r){
        if(l==r) System.out.println(str);
        else{
            for(int i=l;i<=r;i++){
                str=swap(str,l,i);
                printPermutations(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }

    static String swap(String str,int l,int r){
        char[] chars=str.toCharArray();
        char tmp=chars[l];
        chars[l]=chars[r];
        chars[r]=tmp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        printPermutations("abc",0,2);
    }
}
