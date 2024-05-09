import java.util.Scanner;
import java.util.Arrays;

public class TaskOne {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int[] scores = new int[10];

for(int i = 0; i < 10; i++){
System.out.print("enter the elements of the array: ");
scores[i] = input.nextInt();

}
for (int j = 0; j < 10; j++) {
//System.out.print(" " + scores[j]);
}
System.out.print(Arrays.toString(scores));


}
}