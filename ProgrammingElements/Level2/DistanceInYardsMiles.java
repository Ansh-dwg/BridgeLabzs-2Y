import java.util.Scanner;

public class DistanceInYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet = sc.nextInt();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f", distanceInYards, distanceInMiles);
    }
}