import java.util.*;
public class FibonacciGenerator {
    public static void generate(int terms){
        int a=0,b=1;
        for(int i=0;i<terms;i++){
            System.out.print(a+" ");
            int c=a+b; a=b; b=c;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(n);
        sc.close();
    }
}
