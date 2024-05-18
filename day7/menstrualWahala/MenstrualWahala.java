import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualWahala {
	
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("1. How are you feeling lately?");
String[ ] enquiryOne = {"A. Feeling a bit tired", "B.  Yes I've been having some cramps", "C. My mood has been all over the place lately ", "D. Trying to practice more self care like taking warm baths", "E. I've been trying to drink more water & eat healthier" };
for ( int counter = 0; counter < enquiryOne.length; counter++){
	System.out.println(enquiryOne[counter]); 
	}
String response = input.nextLine();

boolean validInput = false;
while (!validInput) {
  for (int i = 0; i < enquiryOne.length; i++) {
    if (response.toLowerCase().equals("a") || response.toLowerCase().equals("b") || response.toLowerCase().equals("c") || response.toLowerCase().equals("d") || response.toLowerCase().equals("e")) {
      validInput = true;
      break;
    }
  }
  if (!validInput) {
    System.out.println("Invalid option. Please enter A, B, C, D, or E: ");
    response = input.nextLine();
  }
}

System.out.println("2. Are you experiencing any cramps or discomfort?");
String[ ] enquiryTwo = {"A. Yes, I've been experiencing cramps", "B. I've been feeling bloated and uncomfortable", "C. I've noticed some lower back pain ", "D. I've been experiencing breast tenderness", "E. I've been feeling fatigued and achy" };
for (int count = 0; count < enquiryTwo.length; count++){
	System.out.println(enquiryTwo[count]);
	}
String responseTwo = input.nextLine();

boolean validInput2 = false;
while (!validInput2) {
  for (int i = 0; i < enquiryTwo.length; i++) {
    if (responseTwo.toLowerCase().equals("a") || responseTwo.toLowerCase().equals("b") || responseTwo.toLowerCase().equals("c") || responseTwo.toLowerCase().equals("d") || responseTwo.toLowerCase().equals("e")) {
      validInput2 = true;
      break; 
    }
  }
  if (!validInput2) {
    System.out.println("Invalid option. Please enter A, B, C, or D: ");
    responseTwo = input.nextLine();
  }
}


System.out.println("3. Did you notice any changes in your libido or energy levels recently?");
String[ ] enquiryThree = {"A. My libido has increased", "B. I haven't really paid attention to any changes", "C. I've noticed decrease in my sex drive ", "D. I've been feeling more sensual driving this time", "E. I haven't been in the mood for sex lately" };
for (int count = 0; count < enquiryThree.length; count++){
	System.out.println(enquiryThree[count]);
	}
String responseThree = input.nextLine();

boolean validInput3 = false;
while (!validInput3) {
  for (int i = 0; i < enquiryThree.length; i++) {
    if (responseThree.toLowerCase().equals("a") || responseThree.toLowerCase().equals("b") || responseThree.toLowerCase().equals("c") || responseThree.toLowerCase().equals("d") || responseThree.toLowerCase().equals("e")) {
      validInput3 = true;
      break; 
    }
  }
  if (!validInput3) {
    System.out.println("Invalid option. Please enter A, B, C, or D: ");
    responseThree = input.nextLine();
  }
}


System.out.println("4. Have you been keeping track of your hydration & nutrition?");
String[ ] enquiryFour = {"A. Yes, I've been making sure to drink enough water &  eat balanced meals", "B. I haven't been paying much attention to it lately", "C. I've been focusing on one more than the other", "D. I've been struggling to stay hydrated but I've been eating well" };
for (int count = 0; count < enquiryFour.length; count++){
	System.out.println(enquiryFour[count]);
}
String responseFour = input.nextLine();

boolean validInput4 = false;
while (!validInput4) {
  for (int i = 0; i < enquiryFour.length; i++) {
    if (responseFour.toLowerCase().equals("a") || responseFour.toLowerCase().equals("b") || responseFour.toLowerCase().equals("c") || responseFour.toLowerCase().equals("d")) {
      validInput4 = true;
      break; 
    }
  }
  if (!validInput4) {
    System.out.println("Invalid option. Please enter A, B, C, or D: ");
    responseFour = input.nextLine();
  }
}

System.out.println("As counter-intuitive as it might sound, drinking more water helps to flush out your system and keep you hydrated, and might also take the edge off cramps. Menstrual migraines and headaches are also common at this time, and can while water can't cure either condition, getting dehydrated certainly won't help.");


System.out.println("5. Have you noticed any patterns or irregularities in your cycle?");
String[ ] enquiryFive = {"A. Yes, I've noticed that my cycle tends to be regular ", "B. My cycle has been consistently irregular", "C. I've been experiencing spotting between periods", "D. I've noticed fluctuations in the length of my cycle"};
for (int count = 0; count < enquiryFive.length; count++){
	System.out.println(enquiryFive[count]);}
String responseFive = input.nextLine();

boolean validInput5 = false;
while (!validInput5) {
  for (int i = 0; i < enquiryFive.length; i++) {
    if (responseFive.toLowerCase().equals("a") || responseFive.toLowerCase().equals("b") || responseFive.toLowerCase().equals("c") || responseFive.toLowerCase().equals("d")) {
      validInput5 = true;
      break; 
    }
  }
  if (!validInput5) {
    System.out.println("Invalid option. Please enter A, B, C, or D: ");
    responseFive= input.nextLine();
  }
}


System.out.println("6. How is your stress level lately?");
String[ ] enquirySix = {"A. I haven't been feeling stressed at all ", "B. My stress levels has been fluctuating", "C. My stress level has been through the roof", "D. I fit craze"};
for (int count = 0; count < enquirySix.length; count++){
	System.out.println(enquirySix[count]); }
String responseSix = input.nextLine();

boolean validInput6 = false;
while (!validInput6) {
  for (int i = 0; i < enquirySix.length; i++) {
    if (responseSix.toLowerCase().equals("a") || responseSix.toLowerCase().equals("b") || responseSix.toLowerCase().equals("c") || responseSix.toLowerCase().equals("d")) {
      validInput6 = true;
      break; 
    }
  }
  if (!validInput6) {
    System.out.println("Invalid option. Please enter A, B, C, or D: ");
    responseSix = input.nextLine();
  }
}

System.out.println("7. Would you like reminders on when to expect your next period?");
String[ ] enquirySeven = {"A. Absolutely, that would be helpful ", "B. No, I'm good"};
for (int count = 0; count < enquirySeven.length; count++){
	System.out.println(enquirySeven[count]);}
String responseSeven = input.nextLine();

	if (responseSeven.toLowerCase().equals("a")) {
		System.out.println("You're here because you want to track your period, why don't we get on to it? :)");

		System.out.println("How long does your period last?");
		int periodLength = input.nextInt();
		
		System.out.println("Enter first  date of last menstrual period (dd/mm/yyyy): ");
		String firstDate = input.next();
		
		System.out.println("Enter the cycle length: ");
		int cycleLength = input.nextInt();
		if (cycleLength < 21 || cycleLength > 35 ) {
			System.out.print("Irregular cycle. " + "Your lifestyle choices can have more influence on your period than you might think." + "High stress levels, sudden weight loss, excessive exercise, and even changes in 			diet can lead to shorter periods." );
		}

		if (cycleLength > 21||cycleLength < 35) {
			System.out.println("Regular period");
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate firstDates = LocalDate.parse(firstDate, formatter);
		
		LocalDate nextPeriod = firstDates.plusDays(cycleLength);
		System.out.println("Next Period: " + nextPeriod);

		
		LocalDate flowDates = nextPeriod.plusDays(periodLength);
		System.out.println("Expected Period Duration:" + nextPeriod + " " + "-" + " " + flowDates);

		
		LocalDate ovulationDate = firstDates.plusDays(cycleLength / 2);
		LocalDate fertilePeriod = ovulationDate.minusDays(5);
		LocalDate fertilePeriod2 = ovulationDate.plusDays(2);

		LocalDate safePeriod = nextPeriod.plusDays(7);
		
		
	


		System.out.println("Ovulation Date: " + ovulationDate);
	


		System.out.println("Your fertile period is from:" + fertilePeriod + " " + "-" + " " + fertilePeriod2); 
		System.out.println("Safe Period Days: " + nextPeriod  + " " + "-" + " " +  safePeriod);

		System.out.println();
		System.out.println("Over 1,000,000,000 billion people worldwide are subscribed to our premium package,- don't miss out on the fun. Subscribe now- $12,000 per month only!");

	}else if (responseSeven.toLowerCase().equals("b")) {

		System.out.println("We're sad to see you go :(( Over 1,000,000,000 billion people worldwide are subscribed to our premium package,- don't miss out on the fun. Subscribe now- $12,000 per month only!");
	}


	}
} 