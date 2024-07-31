package part11;

public class Calculator {

    public int factorial(int num) {

        if (num < 0){
            throw new IllegalArgumentException("Invalid number.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (subsetSize < 0 || setSize < subsetSize) {
            throw new IllegalArgumentException("Invalid sets.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
