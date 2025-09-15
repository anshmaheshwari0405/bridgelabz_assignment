import java.util.*;
public class SubstringOccurrences {
    public static int countOccurrences(String s,String sub){
        int count=0,index=0;
        while((index=s.indexOf(sub,index))!=-1){ count++; index+=sub.length(); }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.nextLine();
        System.out.println(countOccurrences(s,sub));
        sc.close();
    }
}
