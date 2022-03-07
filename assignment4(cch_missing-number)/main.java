import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        int startInp = 0;
        int endInp =0;
        int totalSum = 0;

        int sumUptoStartInp = 0;
        int sumUptoEndInp =0;

        Scanner input = new Scanner(System.in);
        startInp = input.nextInt();
        totalSum += startInp;
        System.out.print("Please enter the sequence with missing number as space seperated vaues: ");
       
        while (input.hasNext()) {
            int currentValue = input.nextInt();
            totalSum += currentValue;
            endInp = currentValue;
            }
        
        sumUptoStartInp = (startInp*(startInp-1))/2;
        sumUptoEndInp   = (endInp*(endInp-1))/2;

        int missingNumber = sumUptoEndInp-sumUptoStartInp-totalSum;
        System.out.println(missingNumber);
        }
    }

