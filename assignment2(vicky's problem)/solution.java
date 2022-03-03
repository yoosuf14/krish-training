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
			int timeElapsed = 0;
			timeElapsed += (distance/9)*6;
			int partialRounds = distance%9;
			if (partialRounds>0 && partialRounds<6) {
				timeElapsed += 3;
			}
			if(partialRounds>=6 && partialRounds<=8){
				timeElapsed++;
			}
			if (partialRounds>8 && partialRounds<9) {
				timeElapsed += 2;
			}
			return timeElapsed-3;
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