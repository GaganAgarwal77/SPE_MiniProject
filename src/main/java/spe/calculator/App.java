package spe.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
		

import java.util.Scanner;

public class App 
{
	private static Logger logger;
	
	public App() {
        logger  = LogManager.getLogger(App.class);
	}
	
    
	double squareRoot(double x) {
        if(x < 0) {
            logger.info("[SQUARE ROOT] [FAILED] " + x);
            logger.info("[RESULT - SQUARE ROOT] [INVALID INPUT] -1");
            return -1;
        }

        double ans = Math.sqrt(x);

        logger.info("[SQUARE ROOT] [SUCCESS] " + x);
        logger.info("[RESULT - SQUARE ROOT] " + ans);

        return ans;
	}

	double factorial(double x) {
        if(x < 0) {
            logger.info("[FACTORIAL] [FAILED] " + x);
            logger.info("[RESULT - FACTORIAL] [INVALID INPUT] -1");
            return -1;
        }
     
        double ans = 1;
        for(int i = 2; i <= x; i++) {
            ans *= i;
        }

        logger.info("[FACTORIAL] [SUCCESS] " + x);
        logger.info("[RESULT - FACTORIAL] " + ans);

        return ans;
	}

	double ln(double x) {
        if(x <= 0) {
            logger.info("[LOGARITHM] [FAILED] -1 " + x);
            logger.info("[RESULT - LOGARITHM] [INVALID INPUT] -1");
            return -1;
        }

        double ans = Math.log(x);

        logger.info("[LOGARITHM] [SUCCESS] " + x);
        logger.info("[RESULT - LOGARITHM] " + ans);

        return ans;
	}

	double power(double x, double b) {
        double ans = Math.pow(x, b);

        logger.info("[POWER] [SUCCESS] " + x + " " + b);
        logger.info("[RESULT - POWER] " + ans);

        return ans;
	}
	
	public static void main( String[] args )
    {
		App cc = new App();
		System.out.println("Scientific Calculator!");
		 while(true) {
	            System.out.println("Choose an operation:");
	            System.out.println("1. squareRoot(x)");
	            System.out.println("2. factorial(x)");
	            System.out.println("3. ln(x)");
	            System.out.println("4. power(x,b)");
	            System.out.println("0. exit");
	            System.out.println("Enter option number:");
	            
	            Scanner scanner = new Scanner(System.in);
	            String optionNum = scanner.nextLine();
	            
	            if(optionNum.equals("1")) {
	                System.out.println("Enter value of 'x': ");

	                double x = scanner.nextDouble();
	                System.out.println(cc.squareRoot(x));
	            }

	            else if(optionNum.equals("2")) {
	                System.out.println("Enter value of 'x': ");
	                double x = scanner.nextDouble();
	                System.out.println(cc.factorial(x));
	            }

	            else if(optionNum.equals("3")) {
	                System.out.println("Enter value of 'x': ");
	                double x = scanner.nextDouble();
	                System.out.println(cc.ln(x));
	            }

	            else if(optionNum.equals("4")) {
	                System.out.println("Enter value of 'x': ");
	                double x = scanner.nextDouble();
	                System.out.println("\nEnter value of 'b': ");
	                double b = scanner.nextDouble();
	                System.out.println(cc.power(x,b));
	            }

	            else if(optionNum.equals("0")) {
	            	scanner.close();
	            	System.out.println("Exited!");
	            	break;
	            }
		 }
    }
}
