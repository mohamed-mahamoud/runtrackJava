import java.util.Scanner;

public class jobs13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entre 0 et 9 : ");
        int n = scanner.nextInt();
        while (n<0 || n>9) {
            System.out.print("Le nombre doit être entre 0 et 9: ");
            n = scanner.nextInt();
        }
        for (int i=0; i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }           
        
        scanner.close();
    }
    }

