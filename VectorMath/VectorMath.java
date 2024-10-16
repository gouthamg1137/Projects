package HW00;
/*
 * Goutham Gopal
 */
import java.util.Scanner;
public class VectorMath {

	public static void main(String[] args) {
		boolean repeat = true;
		//Variable declared and initialized outside the do while in order for it to be used
		do {
			System.out.println("Press 1 to add 2 Vectors");
			System.out.println("Press 2 to subtract 2 Vectors");
			System.out.println("Press 3 to find the magnitude of a vector");
			System.out.println("Press 4 to quit");
			Scanner sc = new Scanner(System.in);
			boolean playAgain = false;
			while(!playAgain)
				{
					int choice = sc.nextInt();
		
					if(choice == 1)
				{
						addVectors();
				}
				else if(choice == 2)
				{
					subtractVectors();
				}
				else if(choice == 3)
				{
					magnitude();
				}else if(choice == 4)
					System.out.println("End of Vector Math");
					playAgain = true;
				}
			System.out.println("Would you like to play again:? Enter 'true'");
			repeat = sc.nextBoolean();
		}while(repeat);
	
	}//Ending bracket of main
	
	/*
	 * Method to find magnitude
	 */
	public static void magnitude() {
		   System.out.println("Please enter the size of vector\n");
		   Scanner sc= new Scanner(System.in);
		   int size=sc.nextInt();
		   double mag=0;
		   double A1[]=new double[size];

		       for(int i=0;i<size;i++)
		{
		   A1[i]=sc.nextInt();
		   mag+=Math.pow(A1[i],2);

		}
		System.out.println("The magnitude is "+Math.sqrt(mag));
	}//Ending bracket of magnitude
	
	/*
	 * Method for subtracting vectors
	 */
	public static void subtractVectors() {
		System.out.println("Enter the size of vector");
		   Scanner sc= new Scanner(System.in);
		   int size=sc.nextInt();
		   double A1[]=new double[size];
		   double A2[]=new double[size];
		System.out.println("Enter the value for Vector 1");
		for(int i=0; i <size; ++i) 
		{
			A1[i]=sc.nextInt();
		}
		System.out.println("Enter value for Vector 2");
		for(int i=0; i<size; ++i)
		{
			A2[i]=sc.nextInt();
		}
		
		System.out.println("The results: ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A1[i]);
		}
		System.out.println(" - ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A2[i]);
		}
		System.out.println(" = ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A1[i] - A2[i]);
		}
	}//Ending bracket of subtractVectors
	
	/*
	 * Method for adding vectors
	 */
	public static void addVectors() {
		System.out.println("Enter the size of vector");
		   Scanner sc= new Scanner(System.in);
		   int size=sc.nextInt();
		   double A1[]=new double[size];
		   double A2[]=new double[size];
		System.out.println("Enter the value for Vector 1");
		for(int i=0; i <size; ++i) 
		{
			A1[i]=sc.nextInt();
		}
		System.out.println("Enter value for Vector 2");
		for(int i=0; i<size; ++i)
		{
			A2[i]=sc.nextInt();
		}
		
		System.out.println("The results: ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A1[i]);
		}
		System.out.println(" + ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A2[i]);
		}
		System.out.println(" = ");
		for(int i =0; i<size;i++)
		{
			System.out.println(A1[i] + A2[i]);
		}
	}//Ending bracket of addVectors
	
	

}
