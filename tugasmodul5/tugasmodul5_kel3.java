import java.util.Scanner;

public class tugasmodul5_kel3 {
    public static void main(String[] args) {
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userLogin user = new userLogin( email, password );
        user.login();
    }
}