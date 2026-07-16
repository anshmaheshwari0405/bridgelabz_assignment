import java.time.*;
import java.util.*;
public class DateArithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.next());
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(result);
        sc.close();
    }
}
