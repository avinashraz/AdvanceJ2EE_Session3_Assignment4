
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] number1 = {15,25,35,45,65,75};
		System.out.println("Enter the number to be inserted: ");
	int  insert =scanner.nextInt();
	
int [] number2 = new int [number1.length+1];
Arrays.sort(number1);
int i =Arrays.binarySearch(number1,insert);
if (i < 0) {
    i = -i - 1;
    System.arraycopy(number1, 0, number2, 0, i);
    System.arraycopy(number1, i, number2, i + 1, number1.length - i);
    number2[i] = insert;
}
System.out.println(Arrays.toString(number2));
	}
	

}
