import java.util.Scanner;

public class jobs05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner le premier chiffre : ");
        int chiffre1 = scanner.nextInt();
        System.out.print("donner le deuxieme chiffre : ");
        int chiffre2 = scanner.nextInt();
        System.out.print("donner le troisieme chiffre : ");
        int chiffre3 = scanner.nextInt();
        int maximum = chiffre1;
        if (chiffre2 > maximum) {
            maximum = chiffre2;
        }
        if (chiffre3 > maximum) {
            maximum = chiffre3;
        }
        
        System.out.println("Le maximum est : " + maximum);

        scanner.close();
    }
}
