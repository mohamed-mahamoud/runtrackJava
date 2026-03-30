import java.util.Scanner;

public class jobs8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner un nombre : ");
        int n = scanner.nextInt();
        int somme = 0;
        for(int i=1; i<=n;i++){
            somme += i*i*i;
        }
        System.out.println("La somme des cubes est : " + somme);
        scanner.close();
    }
}
