interface SecurityUtils {
    // Static method for centralized password policy check
    static boolean checkPasswordStrength(String password) {
        // Policy: Min 8 chars, must contain a number, must contain a special character
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");

        return hasNumber && hasSpecialChar;
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String goodPassword = "P@ssword123";
        String weakPassword = "short";

        System.out.println("\n--- Password Strength Validator ---");
        System.out.println("Good Password check: " + SecurityUtils.checkPasswordStrength(goodPassword)); // True
        System.out.println("Weak Password check: " + SecurityUtils.checkPasswordStrength(weakPassword));  // False
    }
}