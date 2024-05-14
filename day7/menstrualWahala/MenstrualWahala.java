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


String[] EnquiryOne = {"A. Feeling a bit tired", "B.  Yes I've been having some cramps", "C. My mood has been all over the placen lately ", "D. Trying to practice more self care like taking warm baths", "E. I've been trying to drink more water & eat healthier" };
System.out.print("How are you feeling lately?");
for (int count = 0; count < EnquiryOne; count++);{
System.out.println(EnquiryOne[count]);}
String response = input.nextLine();

String[] EnquiryTwo = {"A. Yes, I've been experiencing cramps", "B. I've been feeling bloated and uncomfortable", "C. I've noticed some lower back pain ", "D. I've been experiencing breast tenderness", "E. I've been feeling fatigued and achy" };
System.out.print("Are you experiencing any cramps or discomfort?");
for (int count = 0; count < EnquiryTwo; count++);{
System.out.println(EnquiryTwo[count]);}
String responseTwo = input.nextLine();

String[] EnquiryThree = {"A. My libido has increased", "B. I haven't really paid attention to any changes", "C. I've noticed decrease in my sex drive ", "D. I've been feeling more sensual driving this time", "E. I haven't been in the mood for sex lately" };
System.out.print("Did you notice any changes in your libido or energy levels recently?");
for (int count = 0; count < EnquiryThree; count++);{
System.out.println(EnquiryThree[count]);}
String responseThree = input.nextLine();

String[] EnquiryFour = {"A. Yes, I've been making sure to drink enough water &  eat balanced meals", "B. I haven't been paying much attention to it lately", "C. I've been focusing on one more than the other", "D. I've been struggling to stay hydrated but I've been eating well" };
System.out.print("Have you been keeping track of your hydration & nutrition?");
for (int count = 0; count < EnquiryFour; count++);{
System.out.println(EnquiryFour[count]);}
String responseFour = input.nextLine();





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

		//System.out.printlnP{.,;]]]]							
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
