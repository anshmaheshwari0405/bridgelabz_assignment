import java.util.*;
public class YoungestTallestFinder {
    public static int youngest(int[] ages){
        int idx=0;
        for(int i=1;i<ages.length;i++){ if(ages[i]<ages[idx]) idx=i; }
        return idx;
    }
    public static int tallest(double[] heights){
        int idx=0;
        for(int i=1;i<heights.length;i++){ if(heights[i]>heights[idx]) idx=i; }
        return idx;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        double[] heights=new double[3];
        for(int i=0;i<3;i++){ ages[i]=sc.nextInt(); }
        for(int i=0;i<3;i++){ heights[i]=sc.nextDouble(); }
        System.out.println("Youngest:"+names[youngest(ages)]);
        System.out.println("Tallest:"+names[tallest(heights)]);
        sc.close();
    }
}
