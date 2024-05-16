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
	Contact contact = new Contact(firstName, lastName, number ); //create a constructor and align so that each time you create an object of that class, it will take that nature.
	contacts.add(contact);
	return contact;
	

}

public static String removeContact(){
System.out.print("Enter contact to delete: ");
String deleted = scanner.next();
for(count feed : contacts) {
		if (feed == deleted){
			contacts.remove(feed);
	System.out.print("Contact deleted");

}
}
	


}





}
