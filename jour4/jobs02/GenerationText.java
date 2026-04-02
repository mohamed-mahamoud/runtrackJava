import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class GenerationText {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("la longeur du texte : ");
        long length = scanner.nextInt();
        String Randomtext = "";
        long startTime = System.nanoTime();
        for (long i = 0; i < length; i++) {
            Randomtext += (char) (new Random().nextLong(26) + 'a');
            
        }
        File file = new File("output.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Fichier créé : " + file.getName());
                FileOutputStream writer = new FileOutputStream(file);
                writer.write(Randomtext.getBytes());
                writer.close();
            } else {
                FileOutputStream writer = new FileOutputStream(file);
                writer.write(Randomtext.getBytes());
                writer.close();
            }

            long endTime = System.nanoTime();
            double elapsedMs = (endTime - startTime) / 1_000_000.0;
            System.out.printf("Temps d'execution global : %.3f ms%n", elapsedMs);
        } catch (IOException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }

        scanner.close();

    }
    
}
