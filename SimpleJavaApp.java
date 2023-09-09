public class SimpleJavaApp {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // Simulate some work
            doWork();
            Thread.sleep(1000); // Sleep for 1 second
        }
    }

    private static void doWork() {
        // Simulate some work here
        System.out.println("Doing some work...");
    }
}
