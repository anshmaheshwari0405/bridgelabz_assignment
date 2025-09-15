import java.util.*;
public class RemoveSpecificCharacter {
    public static String removeChar(String s,char ch){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()) if(c!=ch) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        System.out.println(removeChar(s,ch));
        sc.close();
    }
}
