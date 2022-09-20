//21CE097 Manav Patel
//Write a program to to generate user defined exception using “throw” and “throws” keyword.
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class prac2_4 {
    static void userexception() throws MyException {
        System.out.println("In userexception method. ");
        throw new MyException("User defined Exception ");
    }

    public static void main(String[] args) {
        try {
            userexception();
        } catch (MyException e) {
            System.out.println(e);
            System.out.println(e.getMessage());// For get only message
        }
    }
}
