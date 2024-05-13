import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class MenstrualWahala {
	
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter date of last menstrual period: ");
		String lastMenstrualPeriod = input.nextLine();
		System.out.println("Enter the cycle length: ");
		int cycleLength = input.nextInt();
		System.out.println(ovulationDay(cycleLength));
		System.out.println(lastPeriod(lastMenstrualPeriod));
		}

	public static String lastPeriod(String lastMenstrualPeriod){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd-MM-yyyy][dd/MMM/yyyy]");				LocalDate localDate = LocalDate.parse(lastMenstrualPeriod, formatter);
		LocalDate currentDate =  
}

		public static int ovulationDay(int cycleLength) {
			
			
			

}
		
	}
