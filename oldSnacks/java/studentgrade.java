import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

int i = 1;
int students = 0;
int subjects = 0;
int j = 1;
int total = 0;


System.out.println("How many students do you have?");
students = scanner.nextInt();

System.out.println("How many subjects do they offer?");
subjects = scanner.nextInt();

System.out.println();

int[][] scores = new int[students][subjects];

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved Successfully");

for ( i = 0; i < students; i++) {
for ( j = 0; j < subjects; j++) {

	System.out.printf("Entering score for student %d%n", i + 1);
	System.out.printf("Enter score for subject %d%n", j + 1);
	scores[i][j] = scanner.nextInt();
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
   }
   }

System.out.print("=========================================================================");


	

	}
}