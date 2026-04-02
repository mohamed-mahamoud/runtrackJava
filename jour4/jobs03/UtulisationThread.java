
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtulisationThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("la longeur du texte : ");
        long length = scanner.nextInt();
        long legnthTread = length / 2;
        Genereration2Thread thread1 = new Genereration2Thread(legnthTread);
        Genereration2Thread thread2 = new Genereration2Thread(legnthTread);
        long startTime = System.nanoTime();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            String randomText = thread1.getRandomText() + thread2.getRandomText();
            File file = new File("output.txt");
            if (file.createNewFile()) {
                System.out.println("Fichier créé : " + file.getName());
                FileOutputStream writer = new FileOutputStream(file);
                writer.write(randomText.getBytes());
                writer.close();
            } else {
                FileOutputStream writer = new FileOutputStream(file);
                writer.write(randomText.getBytes());
                writer.close();
            }

            long endTime = System.nanoTime();
            double elapsedMs = (endTime - startTime) / 1_000_000.0;
            System.out.printf("Temps d'execution global : %.3f ms%n", elapsedMs);
        } catch (IOException | InterruptedException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }

        scanner.close();

    }
    
}
