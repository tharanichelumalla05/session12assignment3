/*program to check eligibility of voters to vote in the election
 * if greater than 18 age then eligible for voting
 * not eligible thrwing a user defined exception,noteligibletovote
 */
package electionvoting;//here created paackage as assignment12

import java.io.IOException;
import java.util.Scanner;

public class EligibilityOfVote{//created class as ElectionVote
	                      //classes are the basics of opps(object oriented program)
	 static int age;//static is a keyword which identifies class related thing
	                //initializing age
	 public static void main(String args[])throws Exception{  
		// TODO Auto-generated method stub
			//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
			//main is name of method,and to display
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter
            //throw exception
	       
		 System.out.print("enter age");
		 //system is used to return code
         //out is a static number
         //print is used to print text and gives output
        
		 Scanner sc =new Scanner(System.in);//taking new scanner sc
		    int Scanner=sc.nextInt();
		    
	     if(age<18) { //age lessthan 18
	    	
	      System.out.println("not eligible for vote"); 
	      //system is used to return code
          //out is a static number
          //println is used to print text and gives output
         
	     }
	    	 else {
	    	 
	    {
	      System.out.println("eligible for vote");  
	      //system is used to return code
          //out is a static number
          //println is used to print text and gives output
         
	    	 
	}}
	    	 }
	    	    
	      }
