
import java.util.Scanner;

public class Comptage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous voulez compter jusqu'à : ");
        Long limit = scanner.nextLong();
        Long start = System.nanoTime();
        long count = 0;
        while (count < limit) {
            count++;
            System.out.println(count);
        }
        Long end = System.nanoTime();
        System.out.printf("Temps d'execution : %.3f ms%n", (end - start) / 1_000_000.0);
        scanner.close();
    }
    
}
