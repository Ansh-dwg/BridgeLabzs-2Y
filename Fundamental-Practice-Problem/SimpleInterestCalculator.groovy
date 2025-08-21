public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000; // Example principal amount
        double rate = 5;         // Example annual interest rate in percent
        double time = 2;         // Example time in years

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}