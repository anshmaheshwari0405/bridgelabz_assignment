import java.util.*;
public class ToggleCase {
    public static String toggle(String s){
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else if(Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(toggle(sc.nextLine()));
        sc.close();
    }
}
