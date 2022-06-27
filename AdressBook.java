import java.util.Scanner;

public class AdressBook {
   void addContact()
   {

       Scanner scanner = new Scanner(System.in);
       System.out.println("enter the first name");
       String firstname = scanner.nextLine();
       System.out.println("enter the last name");
      String lastname = scanner.nextLine();
       System.out.println("enter the city name");
       String city = scanner.nextLine();
       System.out.println("enter the state");
       String state = scanner.nextLine();
       System.out.println("enter the Zip code");
       String pin = scanner.nextLine();
       System.out.println("enter the Mobile number");
       String mobileNumber = scanner.nextLine();
       System.out.println("email");
       String email = scanner.nextLine();
       ContactList contactList = new ContactList(firstname,lastname,city,state,pin,mobileNumber,email);
       System.out.println(contactList);

    }
}
