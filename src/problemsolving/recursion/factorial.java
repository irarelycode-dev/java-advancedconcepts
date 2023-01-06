package problemsolving.recursion;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class factorial {

    static Map<Integer,Integer> hm=new HashMap<>();
    static int factorial(int n){
        if(n==1) return 1;
        if(hm.containsKey(n)) return hm.get(n);
        int result=n*factorial(n-1);
        if(!hm.containsKey(n)) hm.put(n,result);
        return result;
    }

    static int factorialWithoutHashing(int n){
        if(n==1) return 1;
        return n*factorialWithoutHashing(n-1);
    }

    public static void main(String[] args) {
        Timestamp start= Timestamp.from(Instant.now());
        System.out.println(factorial(5));
        Timestamp end=Timestamp.from(Instant.now());
        System.out.println(end.getTime()-start.getTime());
        start=Timestamp.from(Instant.now());
        System.out.println(factorialWithoutHashing(5));
        end=Timestamp.from(Instant.now());
        System.out.println(end.getTime()-start.getTime());
    }
}
