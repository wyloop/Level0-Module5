package _01_algorithms._2_fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 1;
        int sum;

        for(int i = 0;i < 12;i++) {
            sum = numOne + numTwo;

            System.out.println(numOne);

            numOne = numTwo;
            numTwo = sum;
        }
    }
}
