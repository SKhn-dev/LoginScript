import java.util.Scanner;

public class LoginScript {
    public static void main(String[] args) {
        String userName="Admin";
        String password="Password!";
        int attempts=2;
        boolean result=validateUser(userName, password);
        while(result!=true && attempts<=3){
            attempts++;
            result=validateUser(userName,password);

        }

    }

    public static boolean validateUser(String userName,  String password){
        Scanner input=new Scanner(System.in);
        String inputName, inputPassword;
        System.out.print("Enter user name: ");
        inputName=input.nextLine();
        System.out.print("Enter password: ");
        inputPassword=input.nextLine();
        if(userName.equals(inputName) && password.equals(inputPassword)){
            System.out.println("You have been validated!");
            return true;
        }
        else if(inputName.equals("") || inputPassword.equals("")){
            System.out.println("You must enter a user name");
            return false;
        }
        else{
            System.out.println("Access not authorized");
            return false;
        }


    }

}

