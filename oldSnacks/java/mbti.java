import java.util.Scanner;
import java.util.Map; 
import java.util.HashMap;
import java.util.Arrays;

	public class MbtiPersonalityTest {
	public static void main(String [] args) {
   Scanner scanner = new Scanner(System.in) ;
   System.out.print("What is your name?");
String name = scanner.nextLine();

Map<String,String[]> questions = new HashMap<String,String[]>(); 
questions.put("Question1",["A. expend energy, enjoy groups.", "B. conserve energy, enjoy one on one."]);
questions.put("Question2",["A. interpret literally.", "B. look for meaning and personalities."]);
questions.put("Question3",["A. logical, thinking, questioning.","B. empathetic feeling, accomodating."]);
questions.put("Question4",["A. organized, orderly."B. flexible, adaptable".]);
questions.put("Question5",["A. more outgoing, think out loud.","B. more reserved, think to yourself."]);
questions.put("Question6",["A. practical, realistic, experential.","B. imaginative, innovative, theoretical."]);
questions.put("Question7",["A. candid, straight forward, frank.","B. tactful, kind, encouraging."]);
questions.put("Question8",["A. plan, schedule.","B. unplanned, spontaneous."]);
questions.put("Question9",["A. seek many tasks, public activities, interaction with others.","B. seek private, solitary activities with quiet to concentrate."]);
questions.put("Question10",["A. standard, usual, conventional.","B. different, novel, unique."]);
questions.put("Question11",["A. firm, tend, to criticize, hold the line.","B. gentle, tend to appreciate, conciliate."]);
questions.put("Question12",["A. regulated, structured.","B. easy going, live and let live."]);
questions.put("Question13",["A. external, communicative, express yourself.","B. internal, reticient, keep to yourself."]);
questions.put("Question14",["A. focus on here-and-now.","B. look to the future, global perspective, big picture."]);
questions.put("Question15",["A. tough minded, just.","B.tender-hearted, merciful."]);
questions.put("Question16",["A. preparation, plan ahead.","B. go with the flow, adapt as you go."]);
questions.put("Question17",["A. active, initiate.","B. reflective, deliberate."]);
questions.put("Question18",["A. facts, things, what is.","B. ideas, dreams, what could be, philosophical."]);
questions.put("Question19",["A. matter-of-fact, issue-oriented.","B. sensitive, people-oriented, compassionate."]);
questions.put("Question20",["A. control, govern.","B. latitude, freedom."]);

String[] result = new String[words.length/2];
int counter = 0;
for (int count = 0; counte < words.length; count+=2)
	for(innerCount = 0; innerCount < words[count].length;
  System.out.println(words[count][innerCount] + " " + words
  System.out.println("Enter either options A or B: ");
  String userInput = input.nextLine();
if(userInput.equalsIgnoreCase("A")) {
	result[counter] = userInput + " " + words[count + 1];
		counter++
}
if(userInput.equalsIgnoreCase("B")) {
	result[counter] = userInput + " " + words[count + 1];
		counter++
 }
}
System.out.println(Arrays.toString(result));
  }
}

System.out.print("Please select either option A or B: ");
System.out.print(options);
boolean validInput = false;


while(!validInput) {
	
      System.out.println("Expected A ot B Response.\n" " I know this is an error, please retry again");
      String option = scanner.nextLine();
      option = option.toUpperCase();

	Iterator it = mp.entrySet().iterator();
    	while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove();
          }
	           }
   } 
 }