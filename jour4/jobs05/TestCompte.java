import java.util.Scanner;

public class TestCompte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jusqu'à combien voulez-vous compter ? ");
        long limit = scanner.nextLong();
        ComptageThread.comptage = 1;
        ComptageThread thread1 = new ComptageThread(limit, 1);
        ComptageThread thread2 = new ComptageThread(limit, 2);

        long start = System.nanoTime();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            long end = System.nanoTime();
            System.out.printf("Temps d'execution : %.3f ms%n", (end - start) / 1_000_000.0);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scanner.close();
    }
}
