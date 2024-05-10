import java.util.Scanner;

public class ATMCard{

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
System.out.print("Enter a credit card number");
String number = scanner.nextLine();
	
System.out.print(number + " is ",  (isValid(number) ? "valid" : "invalid"));

}

public static boolean isValid(String numbers) {

if (number.length == 16 ){
	return valid;
}
else {
	return invalid;
}
	
if (prefixMatched(number, 4 || 5 || 6)) {
	return valid;

}
else {
	return invalid;
	} 
	
   

}

}