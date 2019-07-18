import javax.swing.*;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        int divisor=0,prime_number=0,i,j,a,b;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Number a");
        a = input.nextInt();
        System.out.println("Number b");
        b = input.nextInt();

        for(i=a;i<=b;i++) {
            divisor=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    divisor+=1;
            }
            if(divisor==2)
            {
                prime_number+=1;
            }
        }

        JOptionPane.showMessageDialog(null,"["+a+","+b+"] contains "+prime_number+" prime numbers");


    }
}
