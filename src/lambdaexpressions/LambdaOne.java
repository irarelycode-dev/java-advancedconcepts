package lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaOne {

    interface StringFunction{
        String run(String str);
    }

    interface StringFunctionTwo{
        String run(int a,int index);
    }

    public static void printFormatted(String str,StringFunction format){
        String result=format.run(str);
        System.out.println(result);
    }

    public static void printFormattedTwo(int entry,int index,StringFunctionTwo format){
        String result=format.run(entry,index);
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.forEach(n->{
            System.out.println(n);
        });
        System.out.println("Consumer method:");
        Consumer<Integer> lambdaMethod=n-> System.out.println(n);
        al.forEach(lambdaMethod);
        System.out.println("String function:");
        StringFunction exclaim=s->s+"!";
        StringFunction ask=s->s+"?";
        printFormatted("Hello",exclaim);
        printFormatted("Hello",ask);
        System.out.println("String function two:");
        StringFunctionTwo func=(entry,index)-> index+" "+entry;
        final int[] i = {0};
        al.forEach(n->{
            printFormattedTwo(n, i[0],func);
            i[0]++;
        });
    }
}
