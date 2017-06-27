
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java .io .File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;



/* Programmed by Andrew Dipretoro  
 	HomeWork  3 
 	Computer Science 1 Java

 */


public class ChecksonCheck
{
	
	public  static void  main(String[] args) throws IOException {
		// blank object
		Chck chck = new Chck(  );
			// Array
		
	boolean quit = false ;
		String ToQuit = null ;
		String viewregister = null;
		String Nameofperson =  "Andrew Dipretoro" ;
		String amountinWord , memo , Date ;
		String payee;
		
				double checknumber = 0 ;
				 double checkamount = 0 ;			
				int length = -1 ;
			 					Scanner input = new Scanner(System.in);
			 			 		
			 			 		Scanner scan= new Scanner(System.in) ;
			 				
			 			 		 int[] CheckAMt = new int [length] ;	
			 			 		
			 	       		
			 				Scanner in = new Scanner(System.in);
				
			 			 		
			 			 		
			 
			 				
			 	 			try{ 				
			 			
			 	 				while	 (!quit)
			 			
			 	 				{
			 			System.out.println(" Enter number of checks  your going to enter  ") ;
			 			length = input.nextInt()	;
			 			
					
						 System.out.println("Please enter Name of payee");
						 payee= scan.nextLine () ;
						 
						 
						 System.out.println("Please enter the checknumber");
						 checknumber= scan.nextDouble ();
						 
						 
						 System.out.println("Please enter The check amount");
						 checkamount= scan.nextDouble();
						 int CheckAmt= in.nextInt();
						 
						 System.out.println("Please enter the date");
						 Date= scan.next();
						 
						 
						 System.out.println("Please enter the memo");
						 memo= scan.next();
			 	 				
						 chck.setDate(Date);
						 chck.setcheckamount(checkamount);
						 chck.setchecknumber(checknumber);
						 chck.Setpayee(payee);
						 chck.Setmemo(memo);
						
						 System.out.println();
			 	 	
						 System.out.printf( "press Q to quit the program  . Press  to  .");
						 ToQuit= scan.next();
						
						
						 
						 if ( ToQuit.equalsIgnoreCase( "Q")){
							 quit = true ;  
						 }} }
						
					  		
					 catch (Exception e ) {
							 System.out.println(" you had and error try again ass hole "); 
							 
					 
					 File happyfile = new File("happyfile.txt");
					 FileWriter filewriter= new FileWriter( happyfile ,true);
					FileOutputStream fos = new FileOutputStream(happyfile);
					 ObjectOutputStream oos = new ObjectOutputStream(fos);
					 oos.writeObject(chck);
					
					
					
					
					
					
					if(happyfile.exists()== false){
						 
						 happyfile.createNewFile();
						 System.out.println( "file has been created ");
					 }else{
						 System.out.println("the File already exists");
					 }
					 
					
							 
					  
					  
					
					 
	

}
	}
	class Chck implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	



	
	


		 
		 
	 
	 
	 


	


		


	