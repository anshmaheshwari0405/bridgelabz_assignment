import java.util.Scanner;
public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        printCalendar(m,y);
        sc.close();
    }
    static void printCalendar(int month,int year) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year)) days[1]=29;
        int d0 = firstDayOfMonth(1,month,year);
        System.out.println(months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<d0;i++) System.out.print("    ");
        for(int day=1; day<=days[month-1]; day++) {
            System.out.printf("%3d ", day);
            if((day + d0) %7==0) System.out.println();
        }
        System.out.println();
    }
    static boolean isLeap(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
    static int firstDayOfMonth(int d,int m,int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }
}
