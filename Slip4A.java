/*write a java program to display "Hello Java" message n times on the screen ( Use Runnable Interface) */

import java.util.*;

public class Slip4A implements Runnable {
    int n;

    public Slip4A(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello Java");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        new Thread(new Slip4A(n)).start();

        sc.close();
    }
}
