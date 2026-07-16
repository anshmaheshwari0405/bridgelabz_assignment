import java.util.*;
public class RemoveDuplicates {
    public static String removeDuplicates(String s){
        Set<Character> seen=new LinkedHashSet<>();
        for(char ch:s.toCharArray()) seen.add(ch);
        StringBuilder sb=new StringBuilder();
        for(char ch:seen) sb.append(ch);
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(removeDuplicates(sc.nextLine()));
        sc.close();
    }
}
