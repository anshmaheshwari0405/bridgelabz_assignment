import java.util.*;
public class RandomStats {
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
        for(int n:numbers){
            sum+=n;
            if(n<min)min=n;
            if(n>max)max=n;
        }
        double avg=sum/(double)numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int[] arr=generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        double[] stats=findAverageMinMax(arr);
        System.out.println("Average:"+stats[0]+" Min:"+stats[1]+" Max:"+stats[2]);
    }
}
