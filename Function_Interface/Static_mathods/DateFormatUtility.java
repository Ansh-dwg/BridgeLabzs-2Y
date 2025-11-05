import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatInvoiceDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
    static String formatLogDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("\n--- Date Format Utility ---");
        String invoiceFormat = DateFormatter.formatInvoiceDate(today);
        String logFormat = DateFormatter.formatLogDate(today);

        System.out.println("Invoice Format: " + invoiceFormat);
        System.out.println("Log Format:     " + logFormat);
    }
}