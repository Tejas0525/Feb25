import java.util.*;
class CalculateDigits{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n= sc.nextInt();
		int temp=n;
		
		int count=0;

		while(n>0){
			int rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println("the number " + temp + " has " + count + " digits");
	}
}