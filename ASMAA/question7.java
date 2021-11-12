import java.util.Scanner;
public class question7 {
    Scanner aaa =new Scanner(System.in);
    System.out.println("enter first number: ");
    int f_number = aaa.nextInt();
    System.out.println("enter second number: ");
    int s_number = aaa.nextInt();
    int hcf,lcm, a, b, c;
    a = f_number;
    b = s_number;
    while(b!=0){
        c=b;
        b=a%b;
        a=c;
    }
    hcf = a;
    lcm = (f_number * s_number)/hcf;
    System.out.println("the HCF of input numbers is: " +hcf);
    System.out.println("the LCM of input numbers is: " +lcm);
    }
}
