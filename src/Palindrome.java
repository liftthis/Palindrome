

import java.util.ArrayList;


/**
 * <p> 
 * This Java application that prints all of non-prime 
 * (i.e. composite) palindromic numbers between 10 and 10,000 
 * that have all palindromic proper divisors. 
 * Example: The number 3993 is a palindromic composite and all 
 * of the proper divisors of 3993 (1,3,11,33,121,363,1331) 
 * are palindromic.
 * Print one number per line. Each line should include a comma
 * separated list of the proper divisors in parenthesis
 * </p>
 *
 * @creator Fred Martinez
 * @created 2015.09.21
 * @version 1
 */
public class Palindrome 
{

	// global variables
	static int n = 0;
	static int reverse = 0;
	static int sum = 0;
	static int temp;
	static int input = 0;
	
	// list of divisors
	static ArrayList<Integer> divisors = new ArrayList<Integer>();
	// number of divisors
	static int sizeOfList = 0; 
	
	public static void main(String[] args)
	{
		
	   for(int num = 10 ; num <= 10000 ; num++)	
	   {
           //get Palindrome from range from 10 to 10,0000
		   getPalindrome(num);	   
	   }   

	}
	
	/*********************************************************************************
	 ** Function name: getPalindrome
	 ** Descriptions:  This function gets palindrome and list of divisors
	 *********************************************************************************/
	static void getPalindrome(int input)
	{
		n = input;
		temp = input;
		while(n>0)
	    {    
			reverse =n%10;  //getting remainder  
			sum=(sum*10)+reverse;    
		    n=n/10;    
		}    
				 		   
		if(temp==sum) 
		{
		   	   
		   for(int i = 1 ; i <= input ; i++)
		   {  
			   if(input % i == 0)
			   {
				  // not getting the input; only getting the divisors 
				  if(input != i)
				  { 	 
					  // System.out.print(i);
					  divisors.add(i);
					  sizeOfList = divisors.size();
				  }
						    
			   }  
		   }//end for(int i = 1 ; i <= input ; i++)
			
		   //only print values greater then 1
		   if(sizeOfList> 1)
		   {	   
		     System.out.print(input);
		     System.out.print(" (");
		   
		     for (int i=0; i<sizeOfList; i++)
		     {
			    System.out.print(divisors.get(i));
					   
			    if(i < sizeOfList-1)
			    {	   
				   System.out.print(",");
			    }
		     }//end of for (int i=0; i<sizeOfList; i++) 
		   
		     System.out.println(")");
		   }		   
		   restValues(); 
	   
	    }   
	    else 
		{
	    	// not palindrome reset the array 
	    	restValues(); 
		}
	  
	}
	
	/*********************************************************************************
	 ** Function name: restValues
	 ** Descriptions:  This function resets the items used to for calculations 
	 *********************************************************************************/
	static void restValues()
	{
		divisors.clear();
	    n = 0;
		reverse = 0; 
		sum = 0; 
		temp = 0;
		sizeOfList = 0;	
	}

}
