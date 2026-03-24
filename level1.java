import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Hardcoded credentials
        String adminUser = "adminKE";
        String adminPass = "254Secure";

        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String pw = sc.nextLine();

        // Using .equals() is essential for String comparison in Java
        if (user.equals(adminUser) && pw.equals(adminPass)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }
        
        sc.close();
    }
}

