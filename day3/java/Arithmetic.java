import java.util.Scanner;
import java.util.Random;

public class Arithmetic{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random random = new Random();


int correct = 0;
int incorrect = 0;
for (int count = 0; count < 10; count++){
	int number = random.nextInt(10);
	int number2 = random.nextInt(20);	


int problem = number * number2;
System.out.println("What is" + " " + number + "*"  + number2 + "?");
int solution = input.nextInt();
if ( solution == number * number2) {
	correct ++;
	System.out.println("correct");	
}
else {
	incorrect ++;
	System.out.println("incorrect");
}


}

System.out.println("You have" + correct + "correct scores");
System.out.println("You have" + incorrect + "incorrect scores");




	}
}