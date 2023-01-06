package problemsolving.recursion;

public class Sum {

    static int func1(int x,int y){
        if(x==0) return y;
        else return func1(x-1,x+y);
    }

    static int func2(int x){
        if(x==1) return 1;
        return x+func2(x-1);
    }

    public static void main(String[] args) {
        System.out.println(func1(5,4));
        System.out.println(func2(10));
    }
}
