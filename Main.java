package normalizeVector;
import java.lang.Math;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		//Get the dimension of the vector
		System.out.print("Enter the dimension of the vector: ");
		Scanner scanner = new Scanner(System.in);
		int numDim = scanner.nextInt();
		double[] myVector = new double[numDim];
		
		//Get the actual values of the vector
		Scanner in = new Scanner(System.in);
		int userVal = 0;
		
		while(userVal < numDim ) {
				System.out.println("Enter value " +(userVal+1)+ ":");
		
				myVector[userVal] = in.nextInt();
				
			    userVal++;
		}
		
		//Calculate the magnitude for use in the denominator
		double mag = 0;
		  for(int k=0;k<myVector.length;k++){
			    mag+=myVector[k]*myVector[k];
		  	}
		  mag = 1 / Math.sqrt(mag);
		  
		  //multiply each component of original vector by magnitude
		  for(int i = 0; i < myVector.length; i++) {
			  myVector[i] *= mag;
		  }
		  System.out.println("Your normalized vector is: ");
		  for(int j = 0; j < myVector.length; j++) {
			  System.out.println(myVector[j]); 
		  
		  }

		  }
	
	

}
