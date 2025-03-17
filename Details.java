package Railway_Project;

import java.util.Scanner;

public class Details {
    static Scanner s1=new Scanner(System.in);
    static String name;
    static String password;
    static boolean flag;
    
    public static void sign_up() throws Exception{
    	Thread.sleep(200);
    	System.out.println("Enter your name: ");
    	name =s1.next();
    	Thread.sleep(200);
    	System.out.println("Create your password: ");
    	password =s1.next();
    	Thread.sleep(200);
    	System.out.println("Sigup successfully completed");
    	Railway_Ticket.did_Signup=true;
    }
    
    public static void login() throws Exception{
    	flag=true;
    	Thread.sleep(200);
    	System.out.println("\t\tenter user_name");
    	String user_name=s1.next();
    	Thread.sleep(200);
    	System.out.println("\t\tenter the password");
    	String enter_pass=s1.next();
    	Thread.sleep(200);
    	if(user_name.equals(name)&&enter_pass.equals(password)) {
    		System.out.println("\t\t.......Login Successfully");
    		Thread.sleep(200);
    		do {
    			System.out.println("\t\tWelcome to the railway transport");
    			Thread.sleep(400);
    		    System.out.println("t\tChoose the express");
    		    Thread.sleep(200);
    		    System.out.println("\t\t1.YERCAUD EXPRESS\n\t\t2.ANDAMAN EXPRESS\n\t\t3.Exit");
    		    int value=s1.nextInt();
    		    switch(value) {
    		    case 1:
    		    {
    		    	Thread.sleep(200);
    		    	TrainDetails.yercaudExpress();
    		    	Thread.sleep(500);
    		    	break;
    		    }
    		    case 2:
    		    {
    		    	Thread.sleep(200);
    		    	TrainDetails.andamanExpress();
    		    	Thread.sleep(500);
    		    	break;
    		    }
    		    case 3:
    		    {
    		    	Thread.sleep(200);
    		    	System.out.println("\t\t*******Thank you*******");
    		    	Thread.sleep(500);
    		    	flag=false;
    		    	break;
    		    }
    		    default:{
    		    	Thread.sleep(200);
    		    	System.out.println("\t\tChoose correct option");
    		    }
    		    }
    		}
    		while(flag==true);
    	}
    	else {
    		Thread.sleep(200);
	    	System.out.println("\t\tusername or password incorrect");
	    	Thread.sleep(200);
	    	System.out.println("\t\tenter correct data");
    	}
    }
}
