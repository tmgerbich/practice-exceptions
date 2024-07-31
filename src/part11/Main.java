package part11;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        try {
        System.out.println(calculator.factorial(3));
        System.out.println(calculator.factorial(0));
        System.out.println(calculator.factorial(-3));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            System.out.println(calculator.binomialCoefficent(5, 2));
            System.out.println(calculator.binomialCoefficent(0, 0));
            System.out.println(calculator.binomialCoefficent(2, 3));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

}