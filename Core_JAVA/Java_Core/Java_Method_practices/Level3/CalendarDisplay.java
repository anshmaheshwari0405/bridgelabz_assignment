import java.util.*;
public class CalendarDisplay {
    public static String monthName(int m){ String[] ms={"January","February","March","April","May","June","July","August","September","October","November","December"}; return ms[m-1]; }
    public static boolean isLeap(int y){ return (y%4==0 && y%100!=0)||y%400==0; }
    public static int daysInMonth(int m,int y){ int[] d={31,28,31,30,31,30,31,31,30,31,30,31}; if(m==2 && isLeap(y)) return 29; return d[m-1]; }
    public static int firstDayOfMonth(int m,int y){
        int q=1;
        int Y = y - (m<3 ? 1 : 0);
        int K = Y % 100;
        int J = Y / 100;
        int mm = (m+9)%12 +1;
        int h = (q + (13*(mm+1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
        int d = ((h+6)%7);
        return d;
    }
    public static void printCalendar(int m,int y){
        System.out.println("     "+monthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = firstDayOfMonth(m,y);
        int days = daysInMonth(m,y);
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int d=1; d<=days; d++){
            System.out.printf("%3d ", d);
            if((first + d)%7==0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); int y=sc.nextInt();
        printCalendar(m,y);
        sc.close();
    }
}
