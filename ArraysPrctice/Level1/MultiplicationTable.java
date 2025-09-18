import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];
        int resultIndex = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[resultIndex] = number * i;
            resultIndex++;
        }
        resultIndex = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[resultIndex]);
            resultIndex++;
        }
        scanner.close();
    }
}
