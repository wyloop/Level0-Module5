package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
    public static void main(String[] args) {
        boolean isPrime = true;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            JOptionPane.showMessageDialog(null, "This number is prime");
        } else {
            JOptionPane.showMessageDialog(null, "This number is not prime");
        }
    }
}