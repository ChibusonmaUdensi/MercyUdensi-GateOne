import java.util.Scanner;
public class SumAndAverage{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

int total = 0;
	for (int count = 0; count< 10; count++){
	System.out.print("Enter Scores: ");
	int score = scanner.nextInt();
	total += score;
	
}
	int average = total / 10;

System.out.println("the sum is: " + total);
System.out.println("the average is: " + average);

}
}