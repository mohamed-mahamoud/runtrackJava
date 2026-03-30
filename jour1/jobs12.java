import java.util.Scanner;

public class jobs12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre  : ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i + " est un nombre pair");
            }
        }
        scanner.close();
    }
}
