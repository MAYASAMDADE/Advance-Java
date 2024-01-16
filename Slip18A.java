/*Write a java program using multithreading to execute the threads sequentially.Use Synchronized Method)	 */
class Seq {
    synchronized void execute(String threadName) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + threadName + ": Step " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class Slip18A {
    public static void main(String[] args) {
        Seq executor = new Seq();

        new Thread(() -> executor.execute("A")).start();
        new Thread(() -> executor.execute("B")).start();
        new Thread(() -> executor.execute("C")).start();
        //new Thread(() -> executor.execute("D")).start();
    }
}
