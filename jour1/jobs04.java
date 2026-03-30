import java.util.Scanner;

public class jobs04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner un chiffre : ");
        int chiffre = scanner.nextInt();
        int carre=chiffre*chiffre;
        System.out.println("le carre de " + chiffre + " est : " + carre);
        scanner.close();
    }
}
