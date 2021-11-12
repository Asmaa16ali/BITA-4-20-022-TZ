import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        int minutes,day_minutes,year,year_minutes,days;
        Scanner input = new Scanner(System.in);
        System.out.println("enter minutes");
        minutes=input.nextInt();
        day_minutes=(60*24);
        year_minutes=(60*24*365);
        year=(minutes/year_minutes);
        days=(minutes%year_minutes)/day_minutes;
        System.out.println("minutes per years is: "+year);
        System.out.println("minutes per days is: "+days);
    }
}
