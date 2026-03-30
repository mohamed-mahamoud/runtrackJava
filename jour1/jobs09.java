import java.util.Scanner;

public class jobs09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner vitre age : ");
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println("vous etes mineur");
        } else {
            System.out.println("vous etes majeur");
        }
        scanner.close();
    }
}

