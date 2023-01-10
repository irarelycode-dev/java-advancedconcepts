package problemsolving.recursion;

public class RemoveAdjacentRecurring {

    public String removeAdjacent(String str){
        if(str.length()==0 || str.length()==1) return str;
        if(str.charAt(0)==str.charAt(1)){
            while(str.charAt(0)==str.charAt(1)){
                str=str.substring(2,str.length());
            }
            return removeAdjacent(str);
        }else{
            return str.charAt(0)+removeAdjacent(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String word="geeeeeeksfffffoooooooorgeeeeeeeeeks";
        System.out.println(new RemoveAdjacentRecurring().removeAdjacent(word));
    }
}
