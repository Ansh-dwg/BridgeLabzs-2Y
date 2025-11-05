public class BackgroundJobExecution {

    public static void main(String[] args) {
        
        // Define a background task using a Lambda expression for Runnable
        Runnable dataProcessingJob = () -> {
            System.out.println("Job 1: Starting heavy data processing...");
            try {
                // Simulate long-running task
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Job 1: Data processing complete.");
        };

        // Define another job
        Runnable logCleanupJob = () -> {
            System.out.println("Job 2: Starting log file cleanup...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Job 2: Log cleanup finished.");
        };

        System.out.println("\n--- Background Job Execution (Asynchronous) ---");
        System.out.println("Main thread continues while jobs run in the background...");
        
        // Execute the jobs in separate threads
        new Thread(dataProcessingJob).start();
        new Thread(logCleanupJob).start();

        System.out.println("Main thread finished execution setup.");
        // Output will show the main thread message immediately, while the job messages appear later.
    }
}