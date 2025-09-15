import java.util.*;
public class MostFrequentCharacter {
    public static char mostFrequent(String s){
        Map<Character,Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray()) freq.put(ch,freq.getOrDefault(ch,0)+1);
        char maxChar=0; int max=0;
        for(var e:freq.entrySet()){ if(e.getValue()>max){ max=e.getValue(); maxChar=e.getKey(); } }
        return maxChar;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(mostFrequent(sc.nextLine()));
        sc.close();
    }
}
