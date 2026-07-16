import java.util.*;
public class ReplaceWord {
    public static String replaceWord(String sentence,String oldWord,String newWord){
        return sentence.replace(oldWord,newWord);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String oldWord=sc.nextLine();
        String newWord=sc.nextLine();
        System.out.println(replaceWord(sentence,oldWord,newWord));
        sc.close();
    }
}
