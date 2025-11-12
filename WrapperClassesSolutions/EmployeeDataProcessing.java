import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    
    public static void main(String[] args) {
        int[] employeeAges = {28, 35, 42, 25, 31, 45, 29, 38, 33, 27};
        
        System.out.println("=== Employee Data Processing ===\n");
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        
        System.out.println("Converting primitive int array to ArrayList...");
        for (int i = 0; i < employeeAges.length; i++) {
            ageList.add(employeeAges[i]);
        }
        
        System.out.println("Conversion complete!\n");
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Total Employees: " + ageList.size());
        int youngestAge = Collections.min(ageList);
        int oldestAge = Collections.max(ageList);
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Analytics Results:");
        System.out.println("=".repeat(40));
        System.out.println("Youngest Employee Age: " + youngestAge + " years");
        System.out.println("Oldest Employee Age: " + oldestAge + " years");
        System.out.println("Age Difference: " + (oldestAge - youngestAge) + " years");
        System.out.println("=".repeat(40));
        int sum = 0;
        for (int age : ageList) {
            sum = sum + age;
        }
        double averageAge = (double) sum / ageList.size();
        
        System.out.println("\nBonus Calculation:");
        System.out.println("Average Employee Age: " + String.format("%.2f", averageAge) + " years");
    }
}