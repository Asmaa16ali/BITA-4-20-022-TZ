import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        int no_of_gallons,no_of_miles,totalmiles;
        Scanner input = new Scanner(System.in);
        System.out.println(" enter number of gallons ");
        no_of_gallons=input.nextInt();
        System.out.println(" enter number of miles ");
        no_of_miles=input.nextInt();
        totalmiles=no_of_gallons*no_of_miles;
        System.out.println(" the total miles is : " + totalmiles);
    }
}
