package tictactoe;
import java.util.Scanner;

public class KatieHoffmansTicTacToe {

	public static void main(String[] args) {
//introduction
		System.out.println("Welcome to Tic-Tac-Toe, Simplified!");
		System.out.println();
		System.out.println("This is a tic-tac-toe grid:");
		System.out.println(" 	__|__|__");
		System.out.println(" 	__|__|__");
		System.out.println("	  |  |  ");
		System.out.println("Enter any single digit number and press enter to continue:");
//First instruction scanner
			Scanner scana = new Scanner(System.in);
			int a = scana.nextInt ();
		//user selects any number between 0 and 9, instructions continue
		if (a < 10){
		System.out.println("Due to the grid's symmetry, we can see that there are three types of spaces for the first move:");
		System.out.println("	1. The corners");
		System.out.println("	2. The middle");
		System.out.println("	3. The edges");
		System.out.println("Here's what tic-tac-toe looks like with numbers assigned to these three categories:");
		System.out.println(" 	_1_|_3_|_1_");
		System.out.println(" 	_3_|_2_|_3_");
		System.out.println(" 	 1 | 3 | 1 ");
		System.out.println("Enter any single digit number and press enter to continue:");
		
//Second instruction scanner
			Scanner scanb = new Scanner(System.in);
			int b = scanb.nextInt ();
		//user selects any number between 0 and 9, instructions continue
		if (a < 10){
		System.out.println("You'll be 'O's and I'll be 'X's.");
		System.out.println();
		System.out.println("If you'd like to start in a corner, press 1.");
		System.out.println("If you'd like to start in the middle, press 2.");
		System.out.println("If you'd like to start in any of the edge spaces, press 3.");
		System.out.println("(You must always hit 'Enter'/ 'Return' after making a move.)");

//first while loop
boolean go = true; 
while(go){ 
		
		
//First move scanner
			Scanner scanone = new Scanner(System.in);
			int num = scanone.nextInt ();
		//user selects "1" (a1) corner
		if (num == 1){
			System.out.println("You selected a corner:");
			System.out.println(" 	_O_|___|___");
			System.out.println(" 	___|___|___");
			System.out.println(" 	   |   |   ");
			System.out.println("I'll play in the opposite corner:");
			System.out.println(" 	_O_|___|___");
			System.out.println(" 	___|___|___");
			System.out.println(" 	   |   | X ");
			System.out.println("I've taken the liberty of assigning the remaining spaces numbers:");
			System.out.println(" 	_O_|_2_|_3_");
			System.out.println(" 	_4_|_5_|_6_");
			System.out.println(" 	 7 | 8 | X ");
			System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
				//Second scanner if (a1)
				Scanner scana1 = new Scanner(System.in);
				int numa1 = scana1.nextInt ();
				// a1a2
				if (numa1 == 2 || numa1 == 4){
				System.out.println("You selected Space 2 or Space 4. Their positions are alike because of diagonal symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 2, even if you did not.");
				System.out.println(" 	_O_|_O_|_3_");
				System.out.println(" 	_4_|_5_|_6_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("I'll play in Space 3:");
				System.out.println(" 	_O_|_O_|_X_");
				System.out.println(" 	_4_|_5_|_6_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
						//user's third move if a1 then a2
						Scanner scana1a2 = new Scanner(System.in);
						int numa1a2 = scana1a2.nextInt ();
						if (numa1a2 == 6){
							System.out.println("You selected Space 6:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_4_|_5_|_O_");
							System.out.println(" 	 7 | 8 | X ");
							System.out.println("I'll play in Space 7:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_4_|_5_|_O_");
							System.out.println(" 	 X | 8 | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
							//a1a2a3
							Scanner scana1a2a3 = new Scanner(System.in);
								int numa1a2a3 = scana1a2a3.nextInt ();
								if (numa1a2a3 == 4 || numa1a2a3 == 8){
									System.out.println("You selected Space 4 or Space 8:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_?_|_5_|_O_");
									System.out.println(" 	 X | ? | X ");
									System.out.println("I play in Space 5:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_?_|_X_|_O_");
									System.out.println(" 	 X | ? | X ");
									System.out.println("You lose.");
									}
								else if (numa1a2a3 == 5){
									System.out.println("You selected Space 5:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_4_|_O_|_O_");
									System.out.println(" 	 X | 8 | X ");
									System.out.println("I play in Space 8.");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_4_|_O_|_O_");
									System.out.println(" 	 X | X | X ");
									System.out.println("You lose.");
									}
								else{ 
									System.out.println("Your entry was not valid. Please restart this program.");
									}	
							}
						else if (numa1a2 == 4 || numa1a2 == 5 || numa1a2 == 7 || numa1a2 == 8){
							System.out.println("You did not select Space 6. Regardless of which space you selected, you lose.");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_?_|_?_|_X_");
							System.out.println(" 	 ? | ? | X ");
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
					}
				//a1b2
				else if (numa1 == 3 || numa1 == 7){
					System.out.println("You selected Space 3 or Space 7. Their positions are alike because of diagonal symmetry.");
					System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 3, even if you did not.");
					System.out.println(" 	_O_|_2_|_O_");
					System.out.println(" 	_4_|_5_|_6_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I'll play in Space 2:");
					System.out.println(" 	_O_|_X_|_O_");
					System.out.println(" 	_4_|_5_|_6_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
						//user's third move if a1 then b2 (so like a corner followed by #3 or #7)
						Scanner scana1b2 = new Scanner(System.in);
						int numa1b2 = scana1b2.nextInt ();
						//a1b2c1
						if (numa1b2 == 4){
							System.out.println("You selected Space 4:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_O_|_5_|_6_");
							System.out.println(" 	 7 | 8 | X ");
							System.out.println("I'll play in Space 7:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_O_|_5_|_6_");
							System.out.println(" 	 X | 8 | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							//a1b2c1
							Scanner scana1b2c1 = new Scanner(System.in);
								int numa1b2c1 = scana1b2c1.nextInt ();
								if (numa1b2c1 == 8){
									System.out.println("You selected Space 8.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_5_|_6_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I値l play space 5.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_6_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must play Space 6. Tie.");
									}
								else if (numa1b2c1 == 5 || numa1b2c1 == 6){
									System.out.println("You played Space 5 or Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_?_|_?_");
									System.out.println(" 	 X | 8 | X ");
									System.out.println("I play space 8.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_?_|_?_");
									System.out.println(" 	 X | X | X ");
									System.out.println("You lose.");
									}
								else{ 
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						//a1b2c2
						else if (numa1b2 == 5){
							System.out.println("You selected Space 5:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_O_|_6_");
							System.out.println(" 	 7 | 8 | X ");
							System.out.println("I'll play in Space 7:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_O_|_6_");
							System.out.println(" 	 X | 8 | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							//a1b2c2
							Scanner scana1b2c2 = new Scanner(System.in);
								int numa1b2c2 = scana1b2c2.nextInt ();
								if (numa1b2c2 == 8){
									System.out.println("You selected Space 8.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_O_|_6_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I play space 4.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_O_|_6_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must play Space 6. Tie.");
									}
								else if (numa1b2c2 == 4 || numa1b2c2 == 6){
									System.out.println("You chose Space 5 or Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_?_|_O_|_?_");
									System.out.println(" 	 X | 8 | X ");
									System.out.println("I値l play in Space 8:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_?_|_O_|_?_");
									System.out.println(" 	 X | X | X ");
									System.out.println("You lose.");
									}
								else{ 
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						//a1b2c3
						else if (numa1b2 == 6){
							System.out.println("You selected Space 6:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_5_|_O_");
							System.out.println(" 	 7 | 8 | X ");
							System.out.println("I'll play in Space 7:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_5_|_O_");
							System.out.println(" 	 X | 8 | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
							//a1b2c3
							Scanner scana1b2c3 = new Scanner(System.in);
								int numa1b2c3 = scana1b2c3.nextInt ();
								if (numa1b2c3 == 8){
									System.out.println("You selected Space 8.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_5_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I play space 5.");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must play Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1b2c3 == 4 || numa1b2c3 == 5){
									System.out.println("You selected Space 4 or Space 5:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_?_|_?_|_O_");
									System.out.println(" 	 X | 8 | X ");
									System.out.println("I play Space 8:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_?_|_?_|_O_");
									System.out.println(" 	 X | X | X ");
									System.out.println("You lose.");
									}
								else{ 
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						//a1b2c4
						else if (numa1b2 == 7){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_5_|_6_");
							System.out.println(" 	 O | 8 | X ");
							System.out.println("I'll play in Space 5:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | 8 | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
							//a1b2c4
							Scanner scana1b2c4 = new Scanner(System.in);
								int numa1b2c4 = scana1b2c4.nextInt ();
								if (numa1b2c4 == 4){
									System.out.println("You selected Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_6_");
									System.out.println(" 	 O | 8 | X ");
									System.out.println("You win. Congratulations!");
									}
								else if (numa1b2c4 == 8){
									System.out.println("If you selected Space 8:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_6_");
									System.out.println(" 	 O | O	| X ");
									System.out.println("I値l select Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_6_");
									System.out.println(" 	 O | O	| X ");
									System.out.println("You must take Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | O	| X ");
									System.out.println("Tie.");
									}
								else if (numa1b2c4 == 6){
									System.out.println("If you selected Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 O | 8 | X ");
									System.out.println("I値l select Space 8:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 O | X | X ");
									System.out.println("You lose.");
									}
								else{ 
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						//a1b2c5
						else if (numa1b2 == 8){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_5_|_6_");
							System.out.println(" 	 7 | O | X ");
							System.out.println("I'll play in Space 5:");
							System.out.println(" 	_O_|_X_|_O_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 7 | O | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move."); 														
							//a1b2c5
							Scanner scana1b2c5 = new Scanner(System.in);
								int numa1b2c5 = scana1b2c5.nextInt ();
								if (numa1b2c5 == 4){
									System.out.println("You selected Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_6_");
									System.out.println(" 	 7 | O | X ");
									System.out.println("I select Space 7:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_6_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must take Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1b2c5 == 6){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 7 | O | X ");
									System.out.println("I値l select Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 7 | O | X ");
									System.out.println("You must take Space 7:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1b2c5 == 7){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_6_");
									System.out.println(" 	 O | O | X ");
									System.out.println("I値l select Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_6_");
									System.out.println(" 	 O | O | X ");
									System.out.println("You must take Space 6:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | O | X ");
									System.out.println("Tie.");					
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
				
					}
				//a1c2
				else if (numa1 == 6 || numa1 == 8){
					System.out.println("You selected Space 6 or Space 8. Their positions are alike because of diagonal symmetry.");
					System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 6, even if you did not.");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_4_|_5_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I'll play in Space 7:");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_4_|_5_|_O_");
					System.out.println(" 	 X | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					//user's third move if a1 then c2 (so like a corner followed by #6 or #8)
					Scanner scana1c2 = new Scanner(System.in);
						int numa1c2 = scana1c2.nextInt ();
						
						//a1c2a3
						//a1c2b3 & a1c2c3
						if (numa1c2 == 8){
							System.out.println("You selected Space 8:");
							System.out.println(" 	_O_|_2_|_3_");
							System.out.println(" 	_4_|_5_|_O_");
							System.out.println(" 	 X | O | X ");
							System.out.println("I'll play in Space 5:");
							System.out.println(" 	_O_|_2_|_3_");
							System.out.println(" 	_4_|_X_|_O_");
							System.out.println(" 	 X | O | X ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
							// a1c2b3a1c2d3
							Scanner scana1c2b3a1c2d3 = new Scanner(System.in);
								int numa1c2b3a1c2d3= scana1c2b3a1c2d3.nextInt ();
								if (numa1c2b3a1c2d3 == 3){
									System.out.println("You entered Space 3:");
									System.out.println(" 	_O_|_2_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I'll play in Space 2:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must choose Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1c2b3a1c2d3 == 2){
									System.out.println("You selected Space 2:");
									System.out.println(" 	_O_|_O_|_3_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I play Space 3:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You lose.");
									}
								else if (numa1c2b3a1c2d3 == 4){
									System.out.println("You selected Space 4:");
									System.out.println(" 	_O_|_2_|_3_");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I play Space 3:");
									System.out.println(" 	_O_|_2_|_X_");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You lose.");
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						else if (numa1c2 > 1 && numa1c2 < 6){
							System.out.println("You selected Space 2, 3, 4, or 5:");
							System.out.println(" 	_O_|_?_|_?_");
							System.out.println(" 	_?_|_?_|_O_");
							System.out.println(" 	 X | 8 | X ");
							System.out.println("I play Space 8:");
							System.out.println(" 	_O_|_?_|_?_");
							System.out.println(" 	_?_|_?_|_O_");
							System.out.println(" 	 X | X | X ");
							System.out.println("You lose.");
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
					}
				//a1d2
				else if (numa1 == 5){
					System.out.println("You selected Space 5:");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I'll go for Space 7:");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 X | 8 | X ");					
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//second scanner if they select corner then middle "5"
					Scanner scana1d2 = new Scanner(System.in);
					int numa1d2 = scana1d2.nextInt ();
					if (numa1d2 == 8){
						System.out.println("You selected Space 8:");
						System.out.println(" 	_O_|_2_|_3_");
						System.out.println(" 	_4_|_O_|_5_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I'll go for Space 2:");
						System.out.println(" 	_O_|_X_|_3_");
						System.out.println(" 	_4_|_O_|_5_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							// a1c2b3a1c2z3
							Scanner scana1c2b3a1c2z3 = new Scanner(System.in);
								int numa1c2b3a1c2z3= scana1c2b3a1c2z3.nextInt ();
								if (numa1c2b3a1c2z3 == 3){
									System.out.println("You entered Space 3:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_4_|_O_|_5_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I'll play in Space 4:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_O_|_5_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must choose Space 5:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_X_|_O_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1c2b3a1c2z3 == 4){
									System.out.println("You selected Space 4:");
									System.out.println(" 	_O_|_X_|_3_");
									System.out.println(" 	_O_|_O_|_5_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I値l play Space 5:");
									System.out.println(" 	_O_|_X_|_3_");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must choose Space 3:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else if (numa1c2b3a1c2z3 == 5){
									System.out.println("You selected Space 5:");
									System.out.println(" 	_O_|_X_|_3_");
									System.out.println(" 	_4_|_O_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("I play Space 4:");
									System.out.println(" 	_O_|_X_|_3_");
									System.out.println(" 	_X_|_O_|_O_");
									System.out.println(" 	 X | O | X ");
									System.out.println("You must choose Space 3:");
									System.out.println(" 	_O_|_X_|_O_");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	 X | O | X ");
									System.out.println("Tie.");
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
						}
					else if (numa1d2 > 1 && numa1d2 < 5 || numa1d2 == 6){
						System.out.println("You selected Space 2, 3, 4, or 6:");
						System.out.println(" 	_O_|_?_|_?_");
						System.out.println(" 	_?_|_O_|_?_");
						System.out.println(" 	 X | 8 | X ");
						System.out.println("I値l play Space 8:");
						System.out.println(" 	_O_|_?_|_?_");
						System.out.println(" 	_?_|_O_|_?_");
						System.out.println(" 	 X | X | X ");
						System.out.println("You lose.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else{		
					System.out.println("Your entry was not valid. Please restart this program.");
					}
		}
		//user selects "2" (center) which is going to be labeled b1, b stands for middle, 1 stands for user's first move
		else if (num == 2){
			System.out.println("You selected the middle:");
			System.out.println(" 	___|___|___");
			System.out.println(" 	___|_O_|___");
			System.out.println(" 	   |   |   ");
			System.out.println("I'll play in a corner:");
			System.out.println(" 	___|___|___");
			System.out.println(" 	___|_O_|___");
			System.out.println(" 	   |   | X ");
			System.out.println("I've taken the liberty of assigning the remaining spaces numbers:");
			System.out.println(" 	_1_|_2_|_3_");
			System.out.println(" 	_4_|_O_|_6_");
			System.out.println(" 	 7 | 8 | X ");
			System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
			//user's second move if first "2" is selected (b1)
			Scanner scanb1 = new Scanner(System.in);
			int numb1 = scanb1.nextInt ();
			if (numb1 == 2 || numb1 == 4){
				System.out.println("You selected Space 2 or Space 4. Their positions are alike because of diagonal symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 2, even if you did not.");
				System.out.println(" 	_1_|_O_|_3_");
				System.out.println(" 	_4_|_O_|_6_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("I will take Space 8:");
				System.out.println(" 	_1_|_O_|_3_");
				System.out.println(" 	_4_|_O_|_6_");
				System.out.println(" 	 7 | X | X ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
				//b1a2
				Scanner scanb1a2 = new Scanner(System.in);
				int numb1a2 = scanb1a2.nextInt ();
				if (numb1a2 == 7){
					System.out.println("You selected Space 7:");
					System.out.println(" 	_1_|_O_|_3_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 O | X | X ");
					System.out.println("I will select Space 3:");
					System.out.println(" 	_1_|_O_|_X_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 O | X | X ");
					
					//user痴 forth play b1a2a3
					Scanner scanb1a2a3 = new Scanner(System.in);
					int numb1a2a3 = scanb1a2a3.nextInt ();
					if (numb1a2a3 == 6){
						System.out.println("You selected Space 6:");
						System.out.println(" 	_1_|_O_|_X_");
						System.out.println(" 	_4_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("I値l go for Space 4:");
						System.out.println(" 	_1_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("You must select Space 1:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						}
					else if (numb1a2a3 == 1 || numb1a2a3 == 4){
						System.out.println("You selected Space 1 or Space 4:");
						System.out.println(" 	_?_|_O_|_X_");
						System.out.println(" 	_?_|_O_|_6_");
						System.out.println(" 	 O | X | X ");
						System.out.println("I play Space 6:");
						System.out.println(" 	_?_|_O_|_X_");
						System.out.println(" 	_?_|_O_|_X_");
						System.out.println(" 	 O | X | X ");
						System.out.println("You lose.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
									
					}
				else if (numb1a2 == 1 || numb1a2 == 3 || numb1a2 == 4 || numb1a2 == 6){
					System.out.println("You selected Space 1, 2, 4, or 6:");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	 7 | X | X ");
					System.out.println("I値l play Space 7:");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	 X | X | X ");
					System.out.println("You lose.");
					}
				else{
					System.out.println("Your entry was not valid. Please restart this program.");
					}
				}
			else if (numb1 == 3 || numb1 == 7){
				System.out.println("You selected Space 7 or Space 3. Their positions are alike because of diagonal symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 3, even if you did not.");
				System.out.println(" 	_1_|_2_|_O_");
				System.out.println(" 	_4_|_O_|_6_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("I will take Space 7:");
				System.out.println(" 	_1_|_2_|_O_");
				System.out.println(" 	_4_|_O_|_6_");
				System.out.println(" 	 X | 8 | X ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
				
				//b1b2
				Scanner scanb1b2 = new Scanner(System.in);
				int numb1b2 = scanb1b2.nextInt ();
				if (numb1b2 == 8){
					System.out.println("You selected Space 8:");
					System.out.println(" 	_1_|_2_|_O_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 X | O | X ");
					System.out.println("I値l play in Space 2:");
					System.out.println(" 	_1_|_X_|_O_");
					System.out.println(" 	_4_|_O_|_6_");
					System.out.println(" 	 X | O | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//b1b2a3
					//user痴 forth play b1b2a3
					Scanner scanb1b2a3 = new Scanner(System.in);
					int numb1b2a3 = scanb1b2a3.nextInt ();
					if (numb1b2a3 == 4){
						System.out.println("You selected Space 4:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_O_|_O_|_6_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I値l play in Space 6:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You must play in Space 1:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1b2a3 == 6){
						System.out.println("You selected Space 6:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_4_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I値l play in Space 4:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_X_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You must play in Space 1:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_X_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1b2a3 == 1){
						System.out.println("You selected Space 1:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_4_|_O_|_6_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I値l play in Space 4:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_6_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You must play in Space 6:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Tie.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
						
					}
				else if (numb1b2 == 1 || numb1b2 == 2 || numb1b2 == 4 || numb1b2 == 6){
					System.out.println("You chose Space 1, 2, 4, or 6:");
					System.out.println(" 	_?_|_?_|_O_");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	 X | 8 | X ");
					System.out.println("I play Space 8:");
					System.out.println(" 	_?_|_?_|_O_");
					System.out.println(" 	_?_|_O_|_?_");
					System.out.println(" 	 X | X | X ");
					System.out.println("You lose.");
					}
				else{
					System.out.println("Your entry was not valid. Please restart this program.");
					}
				}
			else if (numb1 == 6 || numb1 == 8){
				System.out.println("You selected Space 6 or Space 8. Their positions are alike because of diagonal symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 6, even if you did not.");
				System.out.println(" 	_1_|_2_|_3_");
				System.out.println(" 	_4_|_O_|_O_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("I will take Space 4:");
				System.out.println(" 	_1_|_2_|_3_");
				System.out.println(" 	_X_|_O_|_O_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
				
				Scanner scanb1c2 = new Scanner(System.in);
				int numb1c2 = scanb1c2.nextInt ();
				if (numb1c2 == 1){
					System.out.println("You selected Space 1:");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I値l select Space 7:");
					System.out.println(" 	_O_|_2_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 X | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//b1c2a3
					//user痴 forth play b1c2a3
					Scanner scanb1c2a3 = new Scanner(System.in);
					int numb1c2a3 = scanb1c2a3.nextInt ();
					if (numb1c2a3 == 8){	
						System.out.println("You selected Space 8:");
						System.out.println(" 	_O_|_2_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I select Space 2:");
						System.out.println(" 	_O_|_X_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You must select Space 3:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2a3 == 3 || numb1c2a3 == 2){
						System.out.println("You selected Space 2 or Space 3:");
						System.out.println(" 	_O_|_?_|_?_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | 8 | X ");
						System.out.println("I値l select Space 8:");
						System.out.println(" 	_O_|_?_|_?_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | X | X ");
						System.out.println("You lose.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else if (numb1c2 == 2){
					System.out.println("You selected Space 2:");
					System.out.println(" 	_1_|_O_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I値l select Space 8:");
					System.out.println(" 	_1_|_O_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | X | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					//b1c2b3
					//user痴 forth play b1c2b3
					Scanner scanb1c2b3 = new Scanner(System.in);
					int numb1c2b3 = scanb1c2b3.nextInt ();
					if (numb1c2b3 == 7){	
						System.out.println("You selected Space 7:");
						System.out.println(" 	_1_|_O_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("I select Space 3:");
						System.out.println(" 	_1_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("You must select Space 1:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2b3 == 1 || numb1c2b3 == 3){
						System.out.println("You selected Space 1 or Space 3:");
						System.out.println(" 	_?_|_O_|_?_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | X | X ");
						System.out.println("I値l play in Space 7:");
						System.out.println(" 	_1_|_O_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | X | X ");
						System.out.println("You lose.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else if (numb1c2 == 3){
					System.out.println("You selected Space 3:");
					System.out.println(" 	_1_|_2_|_O_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I値l select Space 7:");
					System.out.println(" 	_1_|_2_|_O_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 X | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//user痴 forth play b1c2c3
					Scanner scanb1c2c3 = new Scanner(System.in);
					int numb1c2c3 = scanb1c2c3.nextInt ();
					if (numb1c2c3 == 1){	
						System.out.println("You selected Space 1:");
						System.out.println(" 	_O_|_2_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | 8 | X ");
						System.out.println("I select Space 8:");
						System.out.println(" 	_O_|_2_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | X | X ");
						System.out.println("You lose.");
						}
					else if (numb1c2c3 == 2){
						System.out.println("You selected Space 2:");
						System.out.println(" 	_1_|_O_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | 8 | X ");
						System.out.println("I select Space 8:");
						System.out.println(" 	_1_|_O_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | X | X ");
						System.out.println("You lose.");
						}
					else if (numb1c2c3 == 8){
						System.out.println("You selected Space 8:");
						System.out.println(" 	_1_|_2_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("I select Space 1:");
						System.out.println(" 	_X_|_2_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You lose.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else if (numb1c2 == 7){
					System.out.println("You selected Space 7:");
					System.out.println(" 	_1_|_2_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 O | 8 | X ");
					System.out.println("I値l select Space 3:");
					System.out.println(" 	_1_|_2_|_X_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 O | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//user痴 forth play b1c2d3
					Scanner scanb1c2d3 = new Scanner(System.in);
					int numb1c2d3 = scanb1c2d3.nextInt ();
					if (numb1c2d3 == 1){
						System.out.println("You selected Space 1:");
						System.out.println(" 	_O_|_2_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | 8 | X ");
						System.out.println("I will select Space 2:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | 8 | X ");
						System.out.println("You must select Space 8:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2d3 == 2){
						System.out.println("You selected Space 2:");
						System.out.println(" 	_1_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | 8 | X ");
						System.out.println("I will select Space 8:");
						System.out.println(" 	_1_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("You must select Space 1:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2d3 == 8){
						System.out.println("You selected Space 8:");
						System.out.println(" 	_1_|_2_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("I will select Space 2:");
						System.out.println(" 	_1_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("You must select Space 1.");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}				
				else if (numb1c2 == 8){
					System.out.println("You selected Space 8:");
					System.out.println(" 	_1_|_2_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | O | X ");
					System.out.println("I値l select Space 2:");
					System.out.println(" 	_1_|_X_|_3_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | O | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//user痴 forth play b1c2e3
					Scanner scanb1c2e3 = new Scanner(System.in);
					int numb1c2e3 = scanb1c2e3.nextInt ();
					if (numb1c2e3 == 1){
						System.out.println("You selected Space 1:");
						System.out.println(" 	_O_|_X_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | O | X ");
						System.out.println("I will select Space 3:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | O | X ");
						System.out.println("You must select Space 7:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2e3 == 3){
						System.out.println("You selected Space 3:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | O | X ");
						System.out.println("I will select Space 7:");
						System.out.println(" 	_1_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("You must select Space 1:");
						System.out.println(" 	_O_|_X_|_O_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 X | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1c2e3 == 7){
						System.out.println("You selected Space 7:");
						System.out.println(" 	_1_|_X_|_3_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("I will select Space 3:");
						System.out.println(" 	_1_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("You must select Space 1:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else{
					System.out.println("Your entry was not valid. Please restart this program.");
					}
				}
			else if (numb1 == 1){
				System.out.println("You selected Space 1:");
				System.out.println(" 	_O_|_2_|_3_");
				System.out.println(" 	_4_|_O_|_5_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("I will take Space 3:");
				System.out.println(" 	_O_|_2_|_X_");
				System.out.println(" 	_4_|_O_|_5_");
				System.out.println(" 	 7 | 8 | X ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
				
				//scan b1d2
				Scanner scanb1d2 = new Scanner(System.in);
				int numb1d2 = scanb1d2.nextInt ();
				if (numb1d2 == 5){
					System.out.println("You selected Space 5:");
					System.out.println(" 	_O_|_2_|_X_");
					System.out.println(" 	_4_|_O_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("I will select space 4:");
					System.out.println(" 	_O_|_2_|_X_");
					System.out.println(" 	_X_|_O_|_O_");
					System.out.println(" 	 7 | 8 | X ");
					System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
					
					//user痴 forth play b1d2a3
					Scanner scanb1d2a3 = new Scanner(System.in);
					int numb1d2a3 = scanb1d2a3.nextInt ();
					if (numb1d2a3 == 2){
						System.out.println("You selected Space 2:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | 8 | X ");
						System.out.println("I will select space 8:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | X | X ");
						System.out.println("You must select Space 7:");
						System.out.println(" 	_O_|_O_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | X | X ");
						System.out.println("Tie.");
						}
					else if (numb1d2a3 == 7){
						System.out.println("You selected Space 7:");
						System.out.println(" 	_O_|_2_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | 8 | X ");
						System.out.println("I will select space 2:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | 8 | X ");
						System.out.println("You must select Space 8:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else if (numb1d2a3 == 8){
						System.out.println("You selected Space 8:");
						System.out.println(" 	_O_|_2_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | O | X ");
						System.out.println("I will select space 2:");
						System.out.println(" 	_O_|_X_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 7 | O | X ");
						System.out.println("You must select Space 7:");
						System.out.println(" 	_O_|_2_|_X_");
						System.out.println(" 	_X_|_O_|_O_");
						System.out.println(" 	 O | O | X ");
						System.out.println("Tie.");
						}
					else{
						System.out.println("Your entry was not valid. Please restart this program.");
						}
					}
				else if (numb1d2 == 2 || numb1d2 == 4 || numb1d2 == 8){
					System.out.println("You selected Space 2, 4, or 8:");
					System.out.println(" 	_O_|_?_|_X_");
					System.out.println(" 	_?_|_O_|_5_");
					System.out.println(" 	 7 | ? | X ");
					System.out.println("I will select space 5:");
					System.out.println(" 	_O_|_?_|_X_");
					System.out.println(" 	_?_|_O_|_X_");
					System.out.println(" 	 7 | ? | X ");
					System.out.println("You lose.");
					}
				else{
					System.out.println("Your entry was not valid. Please restart this program.");
					}
				}
			else{		
				System.out.println("Your entry was not valid. Please restart this program.");
				}
			}
		//user selects "3" (c1) edge
		else if (num == 3){
			System.out.println("You selected an edge:");
			System.out.println(" 	___|_O_|___");
			System.out.println(" 	___|___|___");
			System.out.println(" 	   |   |   ");
			System.out.println("I'll play in the middle:");
			System.out.println(" 	___|_O_|___");
			System.out.println(" 	___|_X_|___");
			System.out.println(" 	   |   |   ");
			System.out.println("I've taken the liberty of assigning the remaining spaces numbers:");
			System.out.println(" 	_1_|_O_|_3_");
			System.out.println(" 	_4_|_X_|_6_");
			System.out.println(" 	 7 | 8 | 9 ");
			System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
			
				//Second scanner if (c1)
				Scanner scanc1 = new Scanner(System.in);
				int numc1 = scanc1.nextInt ();
				
				// c1a2
				if (numc1 == 1 || numc1 == 3){
				System.out.println("You selected Space 1 or Space 3. Their positions are alike because of vertical symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 1, even if you did not.");
				System.out.println(" 	_O_|_O_|_3_");
				System.out.println(" 	_4_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("I'll play in Space 3:");
				System.out.println(" 	_O_|_O_|_X_");
				System.out.println(" 	_4_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
						//user's third move if c1 then a2
						Scanner scanc1a2 = new Scanner(System.in);
						int numc1a2 = scanc1a2.nextInt ();
						//c1a2b3
						if (numc1a2 == 7){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("I'll play in Space 4:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_X_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
								//c1a2a3
								Scanner scanc1a2a3 = new Scanner(System.in);
								int numc1a2a3 = scanc1a2a3.nextInt ();
								if (numc1a2a3 != 6){
									System.out.println("You did not select Space 6. You lose.");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_X_");
									System.out.println(" 	 O | ? | ? ");
									}
								else if (numc1a2a3 == 6){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | 8 | 9 ");
									System.out.println("I値l play in Space 8:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | X | 9 ");
									System.out.println("You must select Space 9. Tie.");							
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						else if (numc1a2 > 5 && numc1a2 < 10 || numc1a2 == 4){
							System.out.println("You chose Space 4, 6, 7, 8, or 9:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_?_|_X_|_?_");
							System.out.println(" 	 7 | ? | ? ");
							System.out.println("I値l choose Space 7:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_?_|_X_|_?_");
							System.out.println(" 	 X | ? | ? ");
							System.out.println("You lose.");
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
					
					}
				// c1b2
				else if (numc1 == 4 || numc1 == 6){
				System.out.println("You selected Space 1 or Space 3. Their positions are alike because of vertical symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 4, even if you did not.");
				System.out.println(" 	_1_|_O_|_3_");
				System.out.println(" 	_O_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("I'll play in Space 3:");
				System.out.println(" 	_1_|_O_|_X_");
				System.out.println(" 	_O_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
						//user's third move if c1 then a2
						Scanner scanc1b2 = new Scanner(System.in);
						int numc1b2 = scanc1b2.nextInt ();
						//c1a2b3
						if (numc1b2 == 7){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("I'll play in Space 4:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_X_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
								//c1a2b3
								Scanner scanc1a2b3 = new Scanner(System.in);
								int numc1b2a1= scanc1a2b3.nextInt ();
								if (numc1b2a1 == 6){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | 8 | 9 ");
									System.out.println("I値l play in Space 8:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | X | 9 ");
									System.out.println("You must select Space 9:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | X | O ");						
									System.out.println("Tie.");
									}
								else if (numc1b2a1 == 8 || numc1b2a1 == 9){
									System.out.println("You selected Space 8 or Space 9:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_6_");
									System.out.println(" 	 O | ? | ? ");
									System.out.println("I値l play in Space 6:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_X_");
									System.out.println(" 	 O | ? | ? ");
									System.out.println("You lose.");
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						else if (numc1b2 == 7){
							System.out.println("You selected Space 8 or Space 9:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_O_|_X_|_?_");
							System.out.println(" 	 7 | ? | ? ");
							System.out.println("I値l select Space 7:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_O_|_X_|_?_");
							System.out.println(" 	 X | ? | ? ");
							System.out.println("You lose.");
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
					}
				// c1c2
				else if (numc1 == 7 || numc1 == 9){
				System.out.println("You selected Space 1 or Space 3. Their positions are alike because of vertical symmetry.");
				System.out.println("For efficiency's sake, let's arbitrarily decide that you selected 4, even if you did not.");
				System.out.println(" 	_1_|_O_|_3_");
				System.out.println(" 	_O_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("I'll play in Space 3:");
				System.out.println(" 	_1_|_O_|_X_");
				System.out.println(" 	_O_|_X_|_6_");
				System.out.println(" 	 7 | 8 | 9 ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
						//user's third move if c1 then a2
						Scanner scanc1c2 = new Scanner(System.in);
						int numc1c2 = scanc1c2.nextInt ();
						if (numc1c2 == 7){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("I'll play in Space 4:");
							System.out.println(" 	_O_|_O_|_X_");
							System.out.println(" 	_X_|_X_|_6_");
							System.out.println(" 	 O | 8 | 9 ");
							System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
							
								//c1c2a3
								Scanner scanc1c2a3 = new Scanner(System.in);
								int numc1c2a3 = scanc1c2a3.nextInt ();
								if (numc1c2a3 != 6){
									System.out.println("You did not select Space 6. You lose.");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_X_");
									System.out.println(" 	 O | ? | ? ");
									}
								else if (numc1c2a3 == 6){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | 8 | 9 ");
									System.out.println("I値l play in Space 8:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_X_|_X_|_O_");
									System.out.println(" 	 O | X | 9 ");
									System.out.println("You must select Space 9. Tie.");							
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							
							}
						else if (numc1c2 == 1 || numc1c2 == 6 || numc1c2 == 8 || numc1c2 == 9){
							System.out.println("You selected Space 1, 6, 8, or 9:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_O_|_X_|_?_");
							System.out.println(" 	 7 | ? | ? ");
							System.out.println("I値l select Space 7:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_O_|_X_|_?_");
							System.out.println(" 	 X | ? | ? ");
							System.out.println("You lose.");
							}
					}
				// c1d2
				else if (numc1 == 8){
				System.out.println("You selected Space 8:");
				System.out.println(" 	_1_|_O_|_3_");
				System.out.println(" 	_4_|_X_|_6_");
				System.out.println(" 	 7 | O | 9 ");
				System.out.println("I'll play in Space 3:");
				System.out.println(" 	_1_|_O_|_X_");
				System.out.println(" 	_4_|_X_|_6_");
				System.out.println(" 	 7 | O | 9 ");
				System.out.println("Please select one of the remaining spaces and enter its number to make your next move.");
						
						Scanner scanc1d2 = new Scanner(System.in);
						int numc1d2 = scanc1d2.nextInt ();
						if (numc1d2 == 7){
							System.out.println("You selected Space 7:");
							System.out.println(" 	_1_|_O_|_X_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | O | 9 ");
							System.out.println("I値l select Space 9:");
							System.out.println(" 	_1_|_O_|_X_");
							System.out.println(" 	_4_|_X_|_6_");
							System.out.println(" 	 O | O | X ");
								Scanner scanc1d2a3 = new Scanner(System.in);
								int numc1d2a3= scanc1d2a3.nextInt ();
								if (numc1d2a3 == 6){
									System.out.println("You selected Space 6:");
									System.out.println(" 	_1_|_O_|_X_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 O | O | X ");
									System.out.println("I値l select Space 1:");
									System.out.println(" 	_X_|_O_|_X_");
									System.out.println(" 	_4_|_X_|_O_");
									System.out.println(" 	 O | O | X ");
									System.out.println("You lose.");
									}
								else if (numc1d2a3 == 1){
									System.out.println("You selected Space 1:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_4_|_X_|_6_");
									System.out.println(" 	 O | O | X ");
									System.out.println("I値l play in Space 6:");
									System.out.println(" 	_O_|_O_|_X_");
									System.out.println(" 	_4_|_X_|_X_");
									System.out.println(" 	 O | O | X ");
									System.out.println("You lose.");
									}
								else if (numc1d2a3 == 4){
									System.out.println("You selected Space 4:");
									System.out.println(" 	_1_|_O_|_X_");
									System.out.println(" 	_O_|_X_|_6_");
									System.out.println(" 	 O | O | X ");
									System.out.println("I値l play in Space 6:");
									System.out.println(" 	_1_|_O_|_X_");
									System.out.println(" 	_O_|_X_|_X_");
									System.out.println(" 	 O | O | X ");
									System.out.println("You lose.");
									}
								else{
									System.out.println("Your entry was not valid. Please restart this program.");
									}
							}
						else if (numc1d2 == 1 || numc1d2 == 4 || numc1d2 == 6 || numc1d2 ==9){
							System.out.println("You selected Space 1, 4, 6, or 9:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_?_|_X_|_?_");
							System.out.println(" 	 7 | O | ? ");
							System.out.println("I値l take Space 7:");
							System.out.println(" 	_?_|_O_|_X_");
							System.out.println(" 	_?_|_X_|_?_");
							System.out.println(" 	 X | O | ? ");
							System.out.println("You lose.");
							}
						else{
							System.out.println("Your entry was not valid. Please restart this program.");
							}
				}
			else{		
				System.out.println("Your entry was not valid. Please restart this program.");
				}
				
				
		}

// Ask user and get user input 
else{
System.out.println("That was not a valid entry. Would you like to restart? (Enter 1 for 'Yes' and 2 for 'No')"); 
Scanner scanz = new Scanner(System.in);
int z = scanz.nextInt ();

//I can't get this loop to work and it's really frustrating. I'm sure it's b/c of some small error or something. *le sigh*
if (z == 1){
	go = true;
	} //should trigger restart
else if (z == 2){
	System.out.println("Thanks for playing!"); 
	} //end of else if
else{
	System.out.println("That also was not a valid entry."); 
	}// End of restart loop 
}//end of if they don't select corners, middle, or edge 

}//??? not sure, this code got so messy when I tried to add a loop to go backwards
		}//second scan intro
}//first scan intro
	}

}
