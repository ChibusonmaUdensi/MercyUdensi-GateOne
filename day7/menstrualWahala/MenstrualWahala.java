import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
public class MenstrualWahala {
	
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);


String[ ] enquiryOne = {"A. Feeling a bit tired", "B.  Yes I've been having some cramps", "C. My mood has been all over the placen lately ", "D. Trying to practice more self care like taking warm baths", "E. I've been trying to drink more water & eat healthier" };
System.out.println("How are you feeling lately?");

for ( int counter = 0; counter < enquiryOne.length; counter++){

	System.out.println(enquiryOne[counter]); 
	}
String response = input.nextLine();


String[ ] enquiryTwo = {"A. Yes, I've been experiencing cramps", "B. I've been feeling bloated and uncomfortable", "C. I've noticed some lower back pain ", "D. I've been experiencing breast tenderness", "E. I've been feeling fatigued and achy" };
System.out.println("Are you experiencing any cramps or discomfort?");

for (int count = 0; count < enquiryTwo.length; count++){

	System.out.println(enquiryTwo[count]);
	}

String responseTwo = input.nextLine();

String[ ] EnquiryThree = {"A. My libido has increased", "B. I haven't really paid attention to any changes", "C. I've noticed decrease in my sex drive ", "D. I've been feeling more sensual driving this time", "E. I haven't been in the mood for sex lately" };
System.out.println("Did you notice any changes in your libido or energy levels recently?");

for (int count = 0; count < EnquiryThree.length; count++){

	System.out.println(EnquiryThree[count]);
	}
String responseThree = input.nextLine();


String[ ] EnquiryFour = {"A. Yes, I've been making sure to drink enough water &  eat balanced meals", "B. I haven't been paying much attention to it lately", "C. I've been focusing on one more than the other", "D. I've been struggling to stay hydrated but I've been eating well" };
System.out.println("Have you been keeping track of your hydration & nutrition?");

for (int count = 0; count < EnquiryFour.length; count++){
System.out.println(EnquiryFour[count]);}
String responseFour = input.nextLine();
System.out.println("As counter-intuitive as it might sound, drinking more water helps to flush out your system and keep you hydrated, and might also take the edge off cramps. Menstrual migraines and headaches are also common at this time, and can while water can't cure either condition, getting dehydrated certainly won't help.");


String[ ] EnquiryFive = {"A. Yes, I've noticed that my cycle tends to be regular ", "B. My cycle has been consistently irregular", "C. I've been experiencing spotting between periods", "D. I've noticed fluctuations in the length of my cycle"};
System.out.println("Have you noticed any patterns or irregularities in your cycle?");

for (int count = 0; count < EnquiryFive.length; count++){
System.out.println(EnquiryFive[count]);}
String responseFive = input.nextLine();


String[ ] EnquirySix = {"A. I haven't been feeling stressed at all ", "B. My stress levels has been fluctuating", "C. My stress level has been through the roof", "D. I fit craze"};
System.out.println("How is your stress level lately?");

for (int count = 0; count < EnquirySix.length; count++){
System.out.println(EnquirySix[count]); }
String responseSix = input.nextLine();


String[ ] EnquirySeven = {"A. Yes, reminders would be helpful ", "B. No, I'm good"};
System.out.println("Would you like reminders or when to expect your next period?");

for (int count = 0; count < EnquirySeven.length; count++){
System.out.println(EnquirySeven[count]);}
String responseSeven = input.nextLine();


		System.out.println("How long does your period last?");
		int periodLength = input.nextInt();
		
		System.out.println("Enter first  date of last menstrual period (dd/mm/yyyy): ");
		String firstDate = input.next();
		
		System.out.println("Enter the cycle length: ");
		int cycleLength = input.nextInt();
		LocalDate localDate = LocalDate.now();
		if (cycleLength < 21 || cycleLength > 35 ) {
			System.out.print("Irregular cycle. " + "Your lifestyle choices can have more influence on your period than 	you might think." + "High stress levels, sudden weight loss, excessive exercise, and even changes in diet can lead 	to shorter periods." );
		}
		if (cycleLength > 21||cycleLength < 35) {
			System.out.println("Regular period");
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String myFormat = localDate.format(formatter);
		LocalDate firstDates = LocalDate.parse(firstDate, formatter);
		
		LocalDate nextPeriod = firstDates.plusDays(cycleLength);
		System.out.println("Next Period: " + nextPeriod);

		
		LocalDate flowDates = nextPeriod.plusDays(periodLength);
		System.out.println("Expected period duration:" + nextPeriod + "-" +  flowDates);

		
		LocalDate ovulationDate = firstDates.minusDays(14);
		LocalDate fertilePeriod = ovulationDate.minusDays(5);
		LocalDate fertilePeriod2 = ovulationDate.plusDays(1);

		LocalDate safePeriod = firstDates.plusDays(14);
		//LocalDate safePeriod2 = firstDates.

		System.out.println("Ovulation Day next Month: " +ovulationDate);
		System.out.println("Your fertile period is from:" + fertilePeriod + "-" + fertilePeriod2); 
		System.out.println("Safe Period Days: " + firstDates  + "-" +  safePeriod);
		//if (cycleLength > 26|| cycleLength <= 32){
		//	System.out.println("Your safe periods runs from day 1 - day 7 of your cycle");
		//	}
		
	}
} 