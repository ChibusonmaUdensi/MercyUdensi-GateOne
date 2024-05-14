import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
public class MenstrualWahala {
	
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How long does your period last?");
		int periodLength = input.nextInt();
		System.out.println("Enter first  date of last menstrual period: ");
		String firstDate = input.next();
		System.out.println("Enter the cycle length: ");
		int cycleLength = input.nextInt();


		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		try{
			cal.setTime(sdf.parse(firstDate));
			}catch(ParseException e){
				e.printStackTrace();
				}


		cal.add(Calendar.DATE, cycleLength);
		String nextPeriod = sdf.format(cal.getTime());

		System.out.println("Next Period Start: " + nextPeriod);
		
		for (int count = 1; count <= periodLength; count++){
	//	String flowDates = nextPeriod  + ((count)- 1) days;
		System.out.print("Your FlowDates  are -: " + nextPeriod +  "-"  +  (count) + "days");

			
			count++;

		System.out.printlnP{.,;]]]]							
}
		


		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd-MM-yyyy][dd/MMM/yyyy]");	
//						LocalDate localDate = LocalDate.parse(lastMenstrualPeriod, formatter);
//		LocalDate currentDate =  LocalDate.now();
//		System.out.println(ovulationDay(cycleLength));
		
//}

//			public static int ovulationDay(int cycleLength) {
//			estimatedOvulation = cycleLength - 14;
//			ovulationDate = estimatedOvulation.parse
//			}
			

}
		
	}
