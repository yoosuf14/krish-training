import java.io.*;
import java.util.Scanner;
class solution{
public int calcJumpTime(int distance){
	//int timeElapsed = 15;

		if(distance<=5){
			return 0;
		}
		if(distance>5 && distance<9){
			return 1;
		}
		if(distance == 9){
			return 3;
		}
		if(distance>=10 && distance<=14){
			return 6;
		}
		//if distance passes first round;
		if(distance>15){
			return 0;
		}

		return 0;
		}
	public static void main(String[] args) {

		solution sol = new solution();
		Scanner input = new Scanner(System.in);
		int distance = input.nextInt();

		int output = sol.calcJumpTime(distance);

		System.out.println(output);
		
	}
}