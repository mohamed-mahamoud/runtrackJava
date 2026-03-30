import java.util.Scanner;

public class jobs14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre  : ");
        String  nombre = scanner.nextLine();
        String inverse = "";
        for (int i = 0; i < nombre.length(); i++) {
        inverse += nombre.charAt(nombre.length() - 1 - i);
        }
        System.out.println("Le nombre inversé est : " + inverse);
        scanner.close();
    }
}
