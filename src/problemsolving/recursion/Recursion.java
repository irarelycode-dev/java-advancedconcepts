package problemsolving.recursion;

public class Recursion {
    static void print(int n){
        if(n<1){
            return;
        }
        System.out.printf("%d",n);
        System.out.println();
        print(n-1);
        System.out.printf("%d",n);
        System.out.println();
    }

    static void printStar(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }

    static void printStars(int n){
        if(n<1) return;
        printStar(n);
        System.out.println();
        printStars(n-1);
        printStar(n);
        System.out.println();
    }

    public static void main(String[] args) {
//        print(10);
        printStars(10);
    }
}
