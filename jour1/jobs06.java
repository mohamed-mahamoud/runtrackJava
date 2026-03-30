import java.util.Scanner;

public class jobs06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner 5 chiffres : ");
        int[] chiffres = new int[5];
        for (int i = 0; i < 5; i++) {
            chiffres[i] = scanner.nextInt();
        }
        int moyenne = 0;
        for (int i = 0; i < 5; i++) {
            moyenne += chiffres[i];
        }
        moyenne /= 5;
        System.out.println("La moyenne est : " + moyenne);

        scanner.close();
    }
    
}
