package Railway_Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainDetails {
      static Scanner s2=new Scanner(System.in);
      List<String> list;
      static TrainDetails trainDetails;
      public TrainDetails(String... route) throws Exception{
    	  list=new ArrayList<String>();
    	  list.addAll(Arrays.asList(route));
    	  int i=1;
    	  for(Object obj:list) {
    		  System.out.println(i++ +""+obj);
    	  }
    	  Thread.sleep(200);
			System.out.println("\t\t Choose the starting location");
			int l1=s2.nextInt()-1;
			Thread.sleep(200);
			System.out.println(list.get(l1));
			Thread.sleep(200);
			
			System.out.println("\t\t Choose the destination");
			int l2=s2.nextInt()-1;
			Thread.sleep(200);
			System.out.println(list.get(l2));
			Thread.sleep(200);
			
			int amt=l2*50;
			System.out.println("\t\tEnter the seats you want: ");
			int seat=s2.nextInt();
            Thread.sleep(500);
            System.out.println("\t\t Total Amount = "+(seat*amt));
            Thread.sleep(200);
            confirm();
      }
      
      public static void yercaudExpress() throws Exception{
    	  System.out.println("\t\tWelcome to yercaud express");
    	  trainDetails=new TrainDetails("Chennai","Ambur","Dharmapuri","Yercaud");
      }
      
      public static void andamanExpress() throws Exception{
    	  System.out.println("\t\tWelcome to yercaud express");
    	  trainDetails=new TrainDetails("Chennai","Vijayawada Junction","Nagpur","Kashmir");
      }
      
      public static void confirm() throws Exception{
    	  System.out.println("\t\t Choose below option to proceed");
    	  System.out.println("\t\t1.Confirm\n\t\t2.Cancel");
    	  int con=s2.nextInt();
    	  
    	  switch(con) {
    	  case 1:
    	  {
    		  Thread.sleep(500);
    		  System.out.println("\t\tYour ticket as been confirmed");
    		  Thread.sleep(200);
    		  break;
    	  }
    	  case 2:
    	  {
    		  Thread.sleep(500);
    		  System.out.println("\t\t Ticket Cancelled");
    		  Thread.sleep(200);
    		  break;
    	  }
    	  default:
    	  {
    		  Thread.sleep(200);
    		  System.out.println("\t\tChoose right option");
    		  confirm();
    	  }
      }
      }
}
