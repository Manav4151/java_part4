
//21CE097 Manav Patel
//Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions. Each ‘catch’ block handles a different type of exception. For example the exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.
import java.util.Scanner;

public class prac3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            if (x == 0) {

                int a = 10 / x;
                System.out.println(a);
            } else {

                int b[] = { 1, 2, 3, 4, 5 };
                System.out.println(b[x]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide By zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Array is  out of range");
        }

        finally {
            System.out.println("Finally must be execute");
        }

    }
}
