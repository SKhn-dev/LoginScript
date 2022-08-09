import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter first Name: ");
        firstName=input.nextLine();
        System.out.print("Enter last name: ");
        lastName=input.nextLine();
        System.out.println("Enter your age: ");
        int age=input.nextInt();
        age++;
        System.out.println("Your full name is "+firstName+" "+lastName);
        System.out.println("Your age next year will be: "+age);
    }
}
