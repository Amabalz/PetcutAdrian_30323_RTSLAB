package Lab1.ex1;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice, n1_real, n1_imag, n2_real, n2_imag, r_real, r_imag;
        System.out.println("Choose:\t 1 - Addition \t 2 - Substraction \t 3 - Multiplication");
        choice = scan.nextInt();
        System.out.println("Enter the two numbers (n1.real, n1.imag, n2.real, n2.imag)");
        n1_real = scan.nextInt();
        n1_imag = scan.nextInt();
        n2_real = scan.nextInt();
        n2_imag = scan.nextInt();
        switch(choice){
            case 1:
                r_real = n1_real + n2_real;
                r_imag = n1_imag + n2_imag;
                System.out.println("The answer is: " + Integer.toString(r_real) + (r_imag < 0 ? "" : "+") + Integer.toString(r_imag) + "j");
                break;
            case 2:
                r_real = n1_real - n2_real;
                r_imag = n1_imag - n2_imag;
                System.out.println("The answer is: " + Integer.toString(r_real) + (r_imag < 0 ? "" : "+") + Integer.toString(r_imag) + "j");
                break;
            case 3:
                r_real = n1_real * n2_real - n1_imag * n2_imag;
                r_imag = n1_real * n2_imag + n1_imag * n2_real;
                System.out.println("The answer is: " + Integer.toString(r_real) + (r_imag < 0 ? "" : "+") + Integer.toString(r_imag) + "j");
                break;
            default:
                System.out.println("Error: wrong choice");
                break;
        }
    }
}
