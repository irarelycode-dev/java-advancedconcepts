package problemsolving.recursion;

import java.util.LinkedList;
import java.util.List;

public class Parantheses {
    static boolean containsOperator(char c){
        if(c=='+' || c=='-' || c=='*' ||c=='/') return true;
        return false;
    }

    public static List<Integer> findWays(String str) {
        List<Integer> res = new LinkedList<>();
        boolean reached=false;
        for (int i = 0; i < str.length(); i++) {
            char operator = str.charAt(i);
            if (containsOperator(operator)) {
                reached=true;
                String part1 = str.substring(0, i);
                String part2 = str.substring(i + 1);
                List<Integer> subPart1 = findWays(part1);
                List<Integer> subPart2 = findWays(part2);
                for (int a : subPart1) {
                    for (int b : subPart2) {
                        int c;
                        if (operator == '+') c = a + b;
                        else if (operator == '-') c = a - b;
                        else if (operator == '*') c = a * b;
                        else c = a / b;
                        res.add(c);
                    }
                }
            }
        }
        if (reached==false) res.add(Integer.valueOf(str));
        return res;
    }

    public static void main(String[] args) {
        String str="2*3-5";
        List<Integer> al=findWays(str);
        for(int a:al){
            System.out.println(a);
        }
    }
}