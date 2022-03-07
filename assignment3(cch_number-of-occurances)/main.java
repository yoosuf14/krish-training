
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] inp =  input.toCharArray();
        int[] inpArray = new int[inp.length];

        for(int i = 0; i<inp.length; i++){
            inpArray[i] = inp[i];
            
            if(inpArray[i]>90){
                inpArray[i] -= 32;
            }
            int x = inpArray[i];
            System.out.println(x);    
        }
    }
}