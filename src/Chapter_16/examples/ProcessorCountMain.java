package Chapter_16.examples;

public class ProcessorCountMain {

    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor Count:" + count);
    }
}