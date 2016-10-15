/*
 Name: Juan Carlos Santana Penner
 MacID: santanjc
 Student Number: 001411625
 Description: This program takes uses recursion to find the Non-contiguius substrings
 */

public class HWK3_1_santanjc {										//make the class HWK3_1_santanjc
	//main method used for putting arguments into the recursive function
	public static void main(String[] args){							//make the main function/method
			System.out.print(binomial(Integer.parseInt(args[0]),Integer.parseInt(args[1])));	//put n and k into the recursive function
	}
	
	//the binomial function the get called recursively 
	public static int binomial(int n, int k){
		if ((1<= k) && (k <= (n-1))){						//if statement
			return binomial(n-1,k-1)+ binomial(n-1,k);		//recursive call (formula)
		}else if ((n==k) || (k==0)){						//base case
			return 1;										//return 1
		}													//end of if statement
		return 0;											//return 0
	}													//end of binomial method
}													//end of class

