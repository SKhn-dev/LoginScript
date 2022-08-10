//A program that validates the user name and password
import java.util.Scanner;

public class LoginScript {
    public static void main(String[] args) {
        String userName="Admin";  //initializing user name and password
        String password="Password!";
        int attempts=2;
        boolean result=validateUser(userName, password);  //Call to the function that validates the input
        while(result!=true && attempts<=3){ //Repeat until the number of attempts is equal to 3 and user not validated
            attempts++;
            result=validateUser(userName,password);

        }

    }
//a funtion that takes user name and password and matches it with the user input
    public static boolean validateUser(String userName,  String password){
        Scanner input=new Scanner(System.in);
        String inputName, inputPassword;
        System.out.print("Enter user name: ");
        inputName=input.nextLine();
        if(inputName.equals(" ")||inputName.isEmpty()) //checks if the user has entered space or left the user name empty.
        {
            System.out.println("You must enter a user name");
            return false;
        }
        System.out.print("Enter password: ");
        inputPassword=input.nextLine();
        if(userName.equals(inputName) && password.equals(inputPassword)){
            System.out.println("You have been validated!");
            return true;
        }
        else{
            System.out.println("Access not authorized");
            return false;
        }


    }

}

