package practice_problems;
import java.util.Scanner;
public class kingdomtaxsystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income:");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket = "";

        if(income < 10000) {
            tax = income*0.5;
            bracket = "5% tax bracket";
        } else if(income <= 50000) {
                tax = income*0.15;
                bracket = "15% tax bracket";
            } else {
                tax = income*0.30;
                bracket = "30% tax bracket";
            }
            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);

            sc.close();
        }
    }
