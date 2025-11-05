import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {
        int charLimit = 50;
        String message1 = "This is a short message.";
        String message2 = "This is a very long message that definitely exceeds the character limit of fifty characters, making it too long for a single tweet or a standard text field.";

        // Function to map String to its length (Integer)
        Function<String, Integer> getLength = String::length;

        // Check and print length
        System.out.println("\n--- String Length Checker ---");
        
        // Test 1
        int length1 = getLength.apply(message1);
        System.out.println("Message 1 length: " + length1);
        if (length1 > charLimit) {
            System.out.println("Message 1 **EXCEEDS** the limit of " + charLimit + " characters.");
        } else {
            System.out.println("Message 1 is within the limit.");
        }

        // Test 2
        int length2 = getLength.apply(message2);
        System.out.println("Message 2 length: " + length2);
        if (length2 > charLimit) {
            System.out.println("Message 2 **EXCEEDS** the limit of " + charLimit + " characters.");
        } else {
            System.out.println("Message 2 is within the limit.");
        }
    }
}