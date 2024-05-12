import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

	public class AgeCalculator {
	
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your birth date: ");
	String dateOfBirth = input.next();
       System.out.println(getAge(dateOfBirth));

}
		public  static int getAge(String dateOfBirth){
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd-MM-yyyy][dd/MMM/yyyy][dd MM yyyy]");
			LocalDate localDate = LocalDate.parse(dateOfBirth, formatter);
			LocalDate currentDate = LocalDate.now();
			Period period = Period.between(localDate, currentDate);
				
				
				return period.getYears();
		

	

	}
}