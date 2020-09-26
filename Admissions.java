import java.util.Scanner;

public class Admissions {

	public static void main( String [] args ) {
		
        Scanner input = new Scanner( System.in );

        

        System.out.print( "Enter your last name:  \n" );
        String last_name = input.nextLine();

        int s = 0;


        if ("Padjen".equals(last_name)) {
            System.out.print( "You got in! Reason: Your last name is Padjen \n" );
            System.exit(0);
        } else if  ("padjen".equals(last_name)) {
            System.out.print( "You got in! Reason: Your last name is Padjen \n" );
            System.exit(0);
        } else {
            System.out.print("Nope! Please continue on: \n" );
        }

        System.out.print( "Do you live in Colorado? (yes, no: Florida, other)  \n" );
        String residence_1 = input.nextLine(); 
    
        if ("yes".equals(residence_1)) { 
            System.out.print("Elite! You got in!\n Reason: You got an elite in one metric!\n");
            System.exit(0);
        } else if ("no".equals(residence_1)) {
            System.out.print("Nope! You didn't get in. Reason: You got lower than Acceptable in a metric. \n");
            System.exit(0);
        } else if ("other".equals(residence_1)) {
            System.out.print("Acceptable \n");
        }
        

        System.out.print( "Enter your SAT Score (0-1600): \n" );
        int SAT = input.nextInt();
        
		if (SAT >= 1500) { 
            System.out.print("Elite! You got in!\n Reason: You got an elite in one metric!\n");
            System.exit(0);
        } else if (SAT >= 1400) {
            System.out.print("Solid \n");
            s = s + 1;
        } else if (SAT >= 1200) {
            System.out.print("Acceptable \n");
        } else {
            System.out.print("Nope! You didn't get in. Reason: You got lower than Acceptable in a metric. \n");
            System.exit(0);
        }


        System.out.print( "Enter your Class Rank Percentile: \n" );
        double rank = input.nextDouble();

        if (rank >= 95) { 
			System.out.print("Elite! You got in!\n Reason: You got an elite in one metric!\n");
            System.exit(0);
        } else if (rank >= 90) {
            System.out.print("Solid \n");
            s = s + 1;
        } else if (rank >= 85) {
            System.out.print("Acceptable \n");
        } else {
            System.out.print("Nope! You didn't get in. Reason: You got lower than Acceptable in a metric. \n");
            System.exit(0);
        }


        System.out.print( "Enter your Awards Earned (0-10+): \n" );
        int award = input.nextInt();

        if (award >= 10) { 
			System.out.print("Elite! You got in!\n Reason: You got an elite in one metric!\n");
            System.exit(0);
        } else if (award >= 8) {
            System.out.print("Solid \n");
            s = s + 1;
        } else if (award >= 3) {
            System.out.print("Acceptable \n");
        } else {
            System.out.print("Nope! You didn't get in. Reason: You got lower than Acceptable in a metric. \n");
            System.exit(0);
        } 

        // System.out.print( "\n" );
        
        if (s >= 2) {
            System.out.print("Solid! You got in!\n Reason: You got solid for 2 metrics!\n");
            System.exit(0);
        }

        System.out.print( "Testing \n");


        



    }
    

}