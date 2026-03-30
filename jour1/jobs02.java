import java.util.Scanner;

public class jobs02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner votre nom : ");
        String nom = scanner.next();
        System.out.println("Bonjour, " + nom );
        scanner.close();
    }
}
