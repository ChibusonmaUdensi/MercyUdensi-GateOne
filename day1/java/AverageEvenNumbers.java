import java.util.Scanner;
public class AverageEvenNumbers {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

int total = 0;
int counter = 0;
int average = 0;
	for (int count = 0; count < 10; count++){
	System.out.print("Enter Scores: ");
	int score = scanner.nextInt();
	if (score % 2 == 0) {
	total += score;
	counter ++;
	average = total/ counter;
}
}

System.out.print("the average of even numbers is: " + average);

}
}