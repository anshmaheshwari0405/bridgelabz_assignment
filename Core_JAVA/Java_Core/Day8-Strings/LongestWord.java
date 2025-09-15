import java.util.*;
public class LongestWord {
    public static String findLongest(String sentence){
        String[] words=sentence.split("\s+");
        String longest="";
        for(String w:words) if(w.length()>longest.length()) longest=w;
        return longest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(findLongest(sc.nextLine()));
        sc.close();
    }
}
