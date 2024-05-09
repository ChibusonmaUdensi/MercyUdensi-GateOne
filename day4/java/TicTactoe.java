import java.util.Scanner;
import java.util.Scanner;
public class TicTacToe{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int row = 3;
	int column = 3;
	int count = 0;
	int counter = 0;
	String tic = null;
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



	


	System.out.print("input tic : "  );
	 tic = input.nextLine(); 


	System.out.print("input x or o : "  );
	 inputCharacter = input.nextLine();
	



	if (tic.equals("1")){

		tic = table [0][0];
		table [0][0] = inputCharacter;
		 
	}else
	if (tic.equals("2")){
		
		tic = table [0][1]; 
		table [0][1] = inputCharacter;
	}else
	if (tic.equals("3")){
		
		tic = table [0][2]; 
		table [0][2] = inputCharacter;
	}else
	if (tic.equals("4")){
		
		tic = table [1][0];
		table [1][0] = inputCharacter;
	}else
	if (tic.equals("5")){
		
		tic = table [1][1];
		table [1][1] = inputCharacter;

	}else
	if (tic.equals("6")){
		
		tic = table [1][2];
		table [1][2] = inputCharacter;
	}else
	if (tic.equals("7")){
		
		tic = table [2][0];
		table [2][0] = inputCharacter;
	}else
	if (tic.equals("8")){
		
		tic = table [2][1];
		table [2][1] = inputCharacter; 
	}else
	if (tic.equals("9")){
		
		tic = table [2][2]; 
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