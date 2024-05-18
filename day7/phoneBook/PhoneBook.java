import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{

public static ArrayList<Contact> contacts = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args){

Contact phone = addContact();
System.out.print(phone);

}

public static Contact addContact(){
	System.out.println("Enter first name: ");
	String firstName = scanner.nextLine();
	System.out.println("Enter last name: ");
	String lastName = scanner.nextLine();
	System.out.println("Enterphone number");
	String number = scanner.nextLine();
	Contact contact = new Contact(firstName, lastName, number ); 
	contacts.add(contact);
	return contact;
	

}

public static String removeContact(){
	System.out.print("Enter contact to delete: ");
	}
	


}






