package Railway_Project;

import java.util.Scanner;

public class Railway_Ticket {
        static boolean did_Signup;
        static boolean cycle;
        static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		
		did_Signup=false;
		cycle=true;
		while(cycle==true) {
			Thread.sleep(200);
			System.out.println("\t\tWelcome to Railway transport");
			Thread.sleep(400);
			System.out.println("\t\t1.Signup\n\t\t2.Login\n\t\t3.Exit");
			int user_ch=s.nextInt();
			
			switch(user_ch) {
			case 1:
			{
				if(did_Signup==false) {
					Thread.sleep(200);
					Details.sign_up();
					Thread.sleep(300);
					break;
				}else {
					Thread.sleep(300);
					System.out.println("\t\t.....Already signup please do login....");
					break;
				}
			}
			case 2:
			{
				if(did_Signup==true) {
					Thread.sleep(200);
					Details.login();
					Thread.sleep(300);
					break;
				}else {
					Thread.sleep(300);
					System.out.println("\t\t.....Please do signup first....");
					break;
				}
			}
			case 3:
			{
				Thread.sleep(300);
				System.out.println("\t\t*******Thank you visit again********");
				cycle=false;
				break;
			}
			default:
			{
				Thread.sleep(200);
				System.out.println("\t\tChoose right option....");
			}
			}
		}

	}

}
