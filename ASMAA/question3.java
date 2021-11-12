import java.util.Scanner;
public class question3{
    public static void main(String[] args) {
        Scanner me = new Scanner (System.in);
        System.out.println("Enter number of Participant");
        int part = me.nextInt();
        int rev = 2500 * part;
        System.out.println("the revenue of the company generate for the tour is  " + rev);
    }
}
