import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean choice =true;
        while(true){
        System.out.println("Enter deposit amount (in Rs.)");
        int principal= scan.nextInt();
        System.out.println("Enter interest rates: 8–12% (current Nepal rates)");
        int interest = scan.nextInt();
        System.out.println("Enter Duration in years (max 5)");
        int duration = scan.nextInt();
         if (principal < 1000 ) {
                System.out.println("Minimum deposit is Rs. 1000 and maximum duration is 5 years ");
        }
            else if( duration >5){
                System.out.println("Maximum duration is 5 years ");
            }
            else if (interest <8|| interest >12){
                System.out.println("Invalid interest rate ");
            }else{
                
                //monthly
                int months = duration * 12;
                double monthlyRate= principal/12/100;
                
                double maturityAmt= principal* Math.pow((1 + monthlyRate),months);
                
            //fee rate and processing
            double fee = principal * 0.005;
            double principalAfterFee = principal - fee;
            
            System.out.println("Amount after fee :\n"+principalAfterFee);
        
        System.out.println("Do you want to continue ? (Yes/No)");
        String cont= scan.next();
            if(cont=="Yes" || cont=="yes"){
            choice=true;
            }
            else{
            choice=false;
            }
           
        }
    }
    }
    }