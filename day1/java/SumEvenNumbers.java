import java.util.Scanner;
public class SumEvenNumbers {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

int total = 0;
	for (int count = 0; count< 10; count++){
	System.out.print("Enter Scores: ");
	int score = scanner.nextInt();
	if (score % 2 == 0) {
	total += score;
}
}
System.out.print("the sum of even numbers is: " + total);

}
}