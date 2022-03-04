import java.io.*;
import java.util.Scanner;
class solution{
public int calcJumpTime(int distance){
	int timeElapsed = 0;
	int distanceTravelled = 0;

		while(distance>distanceTravelled){
			distanceTravelled += 5;
			if (distanceTravelled>=distance)
				break;
				timeElapsed++;

			distanceTravelled +=2;	
			if (distanceTravelled>=distance) 
				break;
				timeElapsed += 2;

			distanceTravelled ++;	
			if (distanceTravelled>=distance) 
				break;
				timeElapsed +=3;

		}
		return timeElapsed;
		}

	public static void main(String[] args) {

		solution sol = new solution();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter distance:");
		int distance = input.nextInt();

		int output = sol.calcJumpTime(distance);

		System.out.println("Time taken to travel the distance of "+distance+" is "+output);
		
	}
}