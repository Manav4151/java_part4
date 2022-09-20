//21CE097 Manav Patel
//Write a program to show the try - catch block to catch the different types of exception.

public class prac1_4 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println("Divide By zero");
        }

        finally {
            System.out.println("Finally must be execute");
        }

        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}