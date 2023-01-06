package problemsolving.leetcode;

public class differentcolumns {
    public static int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            int prev=(int)strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                int curr=(int)strs[j].charAt(i);
                System.out.println("i,prev and curr "+i+" "+prev+" "+curr);
                if(curr<prev){
                    count++;
                    break;
                }
                prev=curr;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
}
