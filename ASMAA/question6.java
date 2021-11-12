import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        int performance;
        int salary;
        Scanner input=new Scanner(System.in);
        System.out.println("enter performance ");
        performance=input.nextInt();
        System.out.println("enter salary ");
        salary=input.nextInt();
        if(performance>=90){
            System.out.println("incrising salary is " + (salary+(0.03*salary)));
            }else{
                System.out.println("the salary is "+ salary);
            }
        }
}
