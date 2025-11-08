import java.util.Scanner;

//Reverse and sum of a three digit number

class ReverseDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a three digit number: ");
		int a = sc.nextInt();
		
		//checking the number
		if(a < 100 || a > 999){
			System.out.println("Enter a valid three digit number");
		} else{
			int num = a;
			
			//Extracting digits
			int d1 = a % 10;	//last digit
			a = a / 10;
			int d2 = a % 10;	//middle digit
			a = a / 10;			
			int d3 = a;			//first digit
			
			//Calculations
			int rev = d1*100+d2*10+d3;
			int sum = d1+d2+d3;
			
			System.out.println("Reversed of " + num + " is: " + rev);
			System.out.println("Sum of digits of " + num + " is: " + sum);

            sc.close();
		}
	}
}
			