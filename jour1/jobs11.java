import java.util.Scanner;

public class jobs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("La factorielle de " + number + " est : " + factorial);
        scanner.close();
    }
}
