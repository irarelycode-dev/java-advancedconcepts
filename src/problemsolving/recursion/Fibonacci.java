package problemsolving.recursion;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static Map<Integer,Integer> hm=new HashMap<>();
    public static int fibonacci(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if(hm.containsKey(n)) return hm.get(n);
        int result=fibonacci(n-1)+fibonacci(n-2);
        if(!hm.containsKey(n)){
            hm.put(n,result);
        }
        return result;
    }

    public static int fibonacciWithoutHashing(int n){
        if(n==1) return 1;
        else if(n==2) return 2;
        return fibonacciWithoutHashing(n-1)+fibonacciWithoutHashing(n-2);
    }

    public static void main(String[] args) {
        int num=10;
        Timestamp start=Timestamp.from(Instant.now());
        System.out.println(fibonacci(10));
        Timestamp end=Timestamp.from(Instant.now());
        System.out.println("diff:"+(end.getTime()-start.getTime()));
        Timestamp startOne=Timestamp.from(Instant.now());
        System.out.println(fibonacciWithoutHashing(10));
        Timestamp endOne=Timestamp.from(Instant.now());
        System.out.println("diff:"+(endOne.getTime()-start.getTime()));

    }
}
