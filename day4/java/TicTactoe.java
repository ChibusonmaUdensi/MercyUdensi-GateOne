import java.util.Scanner;
import java.util.Scanner;
public class TicTacToe{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int row = 3;
	int colum = 3;
	int count = 0;
	int counter = 0;
	String cell = null;
	String inputCharacter = null;
	
		String table [][] = new String [3][3];

		table [0][0] = "-";
		table [0][1] = "-";
		table [0][2] = "-";
		table [1][0] = "-";
		table [1][1] = "-";
		table [1][2] = "-";
		table [2][0] = "-";
		table [2][1] = "-";
		table [2][2] = "-";



	


	System.out.print("input cell : "  );
	String cell = input.nextLine(); 


	System.out.print("input x or o : "  );
	String inputCharacter = input.nextLine();
	if inputCharacter.equalsIgnoreCase("X");
	if inputCharacter.equalsIgnoreCase("O");
	




	if (cell.equals("1")){

		cell = table [0][0];
		table [0][0] = inputCharacter;
		 
	}else
	if (cell.equals("2")){
		
		cell = table [0][1]; 
		table [0][1] = inputCharacter;
	}else
	if (cell.equals("3")){
		
		cell = table [0][2]; 
		table [0][2] = inputCharacter;
	}else
	if (cell.equals("4")){
		
		cell = table [1][0];
		table [1][0] = inputCharacter;
	}else
	if (cell.equals("5")){
		
		cell = table [1][1];
		table [1][1] = inputCharacter;

	}else
	if (cell.equals("6")){
		
		cell = table [1][2];
		table [1][2] = inputCharacter;
	}else
	if (cell.equals("7")){
		
		cell = table [2][0];
		table [2][0] = inputCharacter;
	}else
	if (cell.equals("8")){
		
		cell = table [2][1];
		table [2][1] = inputCharacter; 
	}else
	if (cell.equals("9")){
		
		cell = table [2][2]; 
		table [2][2] = inputCharacter;}



	for (int i = 0; i < 3; i++){
		for (int x = 0; x < 3; x++){


		System.out.print(table[i][x] + "  " );
		System.out.print("  ");
		
		counter++;
		count++;

		}

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
	}


	
	




}

}