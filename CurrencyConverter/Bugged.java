package bugged;
import java.util.Scanner;
public class Bugged{
    public static void main(String[] args) 
   {
       int restart = 1;
       do {
       Scanner keyboard = new Scanner(System.in);
       int choice;
       System.out.println("Would you like to switch from $ to E or E to $");
       System.out.println("    1       2");
       // Implement JOptionPane Here
       // JOptionpane cannot work with scanner as it does it on its own chech my code for details 
       // You can copy my code and run it in VS-code I have the basic structure down and all I need is to copy and paste and add the rates
       choice = keyboard.nextInt();
       switch (choice) {
       // I choose a switch case here to make it easy to expand upon into other currencies
           case 1 -> {
               double dollars = userDollars();
               if (dollars < 0){
                   System.out.println("You can't convert money you don't have");
                   System.out.println("Would you like to run this program again?");
                   System.out.println("1 for Yes or 2 for No");
                   int check = keyboard.nextInt();
                   if (check == 1){
                       dollars = userDollars();
                   }
                   else{
                       System.exit(check);
                   }
               }
// hard-coding the exchange percentage to refine the math
//               double eurosPerDollar = userEurosExchange();
//               if (eurosPerDollar < 0){
//                   System.out.println("You can't convert it into negative money");
//                   System.out.println("Would you like to run this program again?");
//                   System.out.println("1 for Yes or 2 for No");
//                   int check = keyboard.nextInt();
//                   if (check == 1){
//                       eurosPerDollar = userEurosExchange();
//                   }
//                   else{
//                       System.exit(check);
//                   }
//               }
               double grossEuros = dollars - (dollars - (dollars * .92));
               System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros.");
               double rate = 0;
               if (dollars >= 100000){
                   rate = .02;
               }
               if (dollars <= 99999 && dollars >= 50000){
                   rate = .05;
               }
               if (dollars <= 49999 && dollars >= 10000){
                   rate = .08;
               }
               if (dollars <= 9999){
                   rate = .1;
               }
               
               double fee = grossEuros * rate;
               double netEuros = grossEuros - fee;
               System.out.println("");
               System.out.println("Thank you for using the Dollars to Euros Converter.\n");
               System.out.println(dollars + " \tDollars\n " + " 92% " + "\tConversion Rate\n" +
                       grossEuros + " \tGross Euros\n" +
                       rate*100 + " \tFee Percentage\n" +
                       fee + "\tFee in Euros\n" +
                       netEuros + " \tNet Euros\n");
            }
           case 2 -> {
               double euros = userEuros();
               if (euros < 0){
                   System.out.println("You can't convert money you don't have");
                   System.out.println("Would you like to run this program again?");
                   System.out.println("1 for Yes or 2 for No");
                   int check = keyboard.nextInt();
                   if (check == 1){
                       euros = userEuros();
                   }
                   else{
                       System.exit(check);
                   }
               }
               if (euros < 1 && euros > 0){
                   System.out.println("We won't let you convert anything less than a dollar");
                   System.out.println("Would you like to run this program again?");
                   System.out.println("1 for Yes or 2 for No");
                   int check = keyboard.nextInt();
                   if (check == 1){
                       euros = userEuros();
                   }
                   else{
                       System.exit(check);
                   }
               }
//               double dollarPerEuros = userDollarsExchange();
//               if (dollarPerEuros < 0){
//                   System.out.println("You can't convert it into negative money");
//                   System.out.println("Would you like to run this program again?");
//                   System.out.println("1 for Yes or 2 for No");
//                   int check = keyboard.nextInt();
//                   if (check == 1){
//                       dollarPerEuros = userDollarsExchange();
//                   }
//                   else{
//                       System.exit(check);
//                   }
//               }
               double grossDollars = euros + (euros*.08);
               System.out.println(euros + " Euros => " + grossDollars + " Gross Dollars.");
               double rate = 0;
               if (euros >= 100000){
                   rate = .02;
               }
               if (euros <= 99999 && euros >= 50000){
                   rate = .05;
               }
               if (euros <= 49999 && euros >= 10000){
                   rate = .08;
               }
               if (euros <= 9999){
                   rate = .1;
               }
               
               double fee = grossDollars * rate;
               double netEuros = grossDollars - fee;
               System.out.println("");
               System.out.println("Thank you for using the Dollars to Euros Converter.\n");
               System.out.println(euros + " \tEuros\n " + " 108% " + "\tConversion Rate\n" +
                       grossDollars + " \tGross Dollars\n" +
                       rate*100 + " \tFee Percentage\n" +
                       fee + "\tFee in Dollars\n" +
                       netEuros + " \tNet Dollars\n");
           }
           default -> {
               System.out.println("This isn't a choice");
               System.exit(1);
           }
       }
       System.out.println("Would you like to run this program again? 1 for yes, 2 for no");
       restart = keyboard.nextInt();
      } while(restart == 1);
    }

    public static double userDollars(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");
        double dollars = keyboard.nextDouble();
        return dollars;
    }
    
    public static double userEuros(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Euros to Dollars Converter.\n");            
        System.out.print("How many euros do you want to convert? ");
        double dollars = keyboard.nextDouble();
        return dollars;
    }
    
//    public static double userEurosExchange() {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("What is the euros-per-dollar exchange rate? ");        
//        double eurosPerDollar = keyboard.nextDouble();
//        return eurosPerDollar;
//    }
//    
//    public static double userDollarsExchange() {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("What is the dollar-per-euro exchange rate? ");        
//        double dollarPerEuros = keyboard.nextDouble();
//        return dollarPerEuros;
//    }
}

