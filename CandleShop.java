import java.util.Scanner;
public class CandleShop {

    public static void main(String[] args) {
    //empty candle objects
    Candle candleOne = new Candle("",0, 0.0, 0);
    Candle candleTwo = new Candle("",0, 0.0, 0);
    Candle candleThree = new Candle("",0, 0.0, 0);
    //Empty candle quantities 
    int candleOneQuant = 0;
    int candleTwoQuant = 0;
    int candleThreeQuant = 0;



    System.out.println("*******************************");
    System.out.println("Project 3");
    System.out.println("*******************************");
    

    // initiate Scanner 
    Scanner scanner = new Scanner(System.in);
    
    // initiate global candle names 
    String nameCandleOne = "";
    String nameCandleTwo = "";
    String nameCandleThree = "";

    // initiate global candle types
    int candleOneType = 0;
    int candleTwoType = 0;
    int candleThreeType = 0;

    // initiate global candle prices
    double candleOnePrice = 0.0;
    double candleTwoPrice = 0.0;
    double candleThreePrice = 0.0;

    // initiate global candle times
    int candleOneTime = 0;
    int candleTwoTime = 0;
    int candleThreeTime = 0;
    


    // give varibles value of no so loops runs
    String correctInfo = "no";
    String correctInfo2 = "no";
    String correctInfo3 = "no";

      //Starts while loop for shop owner
    while (correctInfo.equalsIgnoreCase("no")) {
            //Asks for name of candle
            System.out.print("Enter a name for your first Candle: ");
            nameCandleOne = scanner.nextLine();

            //Asks for candle type
            System.out.print("Enter a type for your first Candle: ");
            candleOneType = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            //Asks for candle cost
            System.out.print("Enter a cost for your first Candle: ");
            candleOnePrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline character

            //Asks for candle time
            System.out.print("Enter the burn time in minutes for your first Candle: ");
            candleOneTime = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            System.out.println("------------------");
            //Saves the user inputs into the method
            candleOne.setName(nameCandleOne);
            candleOne.setType(candleOneType);
            candleOne.setCost(candleOnePrice);
            candleOne.setTime(candleOneTime);
            System.out.println(candleOne);
            System.out.println("");
            //Asks if the information entered needs to be corrected
            System.out.println("Is this info correct? (yes/no)");
            //Assigns the store owners input to correctInfo
            correctInfo = scanner.nextLine(); 
    }


    while (correctInfo2.equalsIgnoreCase("no")) {
            //Asks for name of candle
            System.out.print("Enter a name for your second Candle: ");
            nameCandleTwo = scanner.nextLine();

            //Asks for candle type
            System.out.print("Enter a type for your second Candle: ");
            candleTwoType = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            //Asks for candle cost
            System.out.print("Enter a cost for your second Candle: ");
            candleTwoPrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline character

            //Asks for candle time
            System.out.print("Enter the burn time in minutes for your second Candle: ");
            candleTwoTime = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            System.out.println("------------------");
            //Saves the user inputs into the method
            candleTwo.setName(nameCandleTwo);
            candleTwo.setType(candleTwoType);
            candleTwo.setCost(candleTwoPrice);
            candleTwo.setTime(candleTwoTime);    
            System.out.println(candleTwo);
            System.out.println("");

            //Asks if the information entered needs to be corrected
            System.out.println("Is this info correct? (yes/no)");
            //Assigns the store owners input to correctInfo2
            correctInfo2 = scanner.nextLine(); 
    }


    while (correctInfo3.equalsIgnoreCase("no")) {
            //Asks for name of candle
            System.out.print("Enter a name for your third Candle: ");
            nameCandleThree = scanner.nextLine();

            //Asks for candle type
            System.out.print("Enter a type for your third Candle: ");
            candleThreeType = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            //Asks for candle cost
            System.out.print("Enter a cost for your third Candle: ");
            candleThreePrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline character
            
            //Asks for candle time
            System.out.print("Enter the burn time in minutes for your third Candle: ");
            candleThreeTime = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            System.out.println("------------------");
            //Saves the user inputs into the method
            candleThree.setName(nameCandleThree);
            candleThree.setType(candleThreeType);
            candleThree.setCost(candleThreePrice);
            candleThree.setTime(candleThreeTime);    
            System.out.println(candleThree);
            System.out.println("");
            //Asks if the information entered needs to be corrected
            System.out.println("Is this info correct? (yes/no)");
            //Assigns the store owners input to correctInfo3
            correctInfo3 = scanner.nextLine(); 
    }


    String shopAgain = "yes";

    while (shopAgain.equalsIgnoreCase("yes")) {
        System.out.println("Welcome to the candle factory! Listed below are the items we offer!");
        System.out.println("");
        //Prints the value of each candle for the shopper
        System.out.println(candleOne);
        System.out.println(candleTwo);
        System.out.println(candleThree);

//  Asks the user how many candles they would like to buy and assigns them to various varibles
        System.out.print("Enter how many Type 1 candles you would like to buy: ");
         candleOneQuant = scanner.nextInt(); 
        System.out.println("");
        System.out.print("Enter how many Type 2 candles you would like to buy: ");
         candleTwoQuant = scanner.nextInt(); 
        System.out.println("");
        System.out.print("Enter how many Type 3 candles you would like to buy: ");
         candleThreeQuant = scanner.nextInt(); 
        scanner.nextLine();             
        System.out.println("");


//Calculates the total cost without the dicount
 double subTotal = (double) Math.round((candleOneQuant * candleOne.getCost()) + (candleTwoQuant* candleTwo.getCost()) + (candleThreeQuant* candleThree.getCost()));
        // Gives the user their subtotal
        System.out.println("Your subtotal before any discount is $" + subTotal);

// Sets the finalPrice as the sub total price 
        double finalPrice = subTotal;
        //If, else if and else used to check the price of the subtotal and edit the final price accordingly 
        if (subTotal < 20){
          //If the subtotal is less than 20, final prices stays the same and alerts ths user
          System.out.println("Unfortunately, since your total is less than $20, you do not qualify for a discount.");
          finalPrice = subTotal;
        }else if ((20 < subTotal) && (subTotal< 35)){
          //If subtotal between 20 and 35, the discount is 5%
          finalPrice= subTotal *.95;
          System.out.println("");
          System.out.println("You earned a 5% discount!");
        }else if ((35 < subTotal) && ( subTotal < 55)){
          //If the subtotal is between 35 and 55 the discount is 7%
          finalPrice = subTotal*.93;
          System.out.println("");
          System.out.println("You earned a 7% discount!");
        }else if ((55 < subTotal) && (subTotal < 100)){
          //If the subtotal is between 55 and 100 the discount is 10%
          finalPrice = subTotal * .90;
          System.out.println("");
          System.out.println("You earned a 10% discount!");
        }else {
          //If the subtotal over 100 and the discount is 20%
          finalPrice = subTotal * .80;
          System.out.println("");
          System.out.println("You earned a 20% discount!");
        }

        System.out.println("------------------");
        //Gives the user the final price based off price calculations
        System.out.println("Your final price is $" + finalPrice);

        //Uses the Candle method and multiplies the user entered quantities by the candle times set by store owner
        double burnTimeTotal = (candleOneQuant * candleOne.getTime()) + (candleTwoQuant* candleTwo.getTime()) + (candleThreeQuant* candleThree.getTime());

        //Divides the finalPrice by the total burn time to get the cost per minute
        double costPerMin = (double) Math.round((finalPrice/burnTimeTotal) * 100) / 100;

        System.out.println("");
        //Gives the user the total burn time
        System.out.println("Your total burn time is " + burnTimeTotal + " minutes");

        System.out.println("");
        //Gives the user the total cost per minute of burn
        System.out.println("Your cost is $" + costPerMin + " per minute of burn time");


        //Checks to see if the subtotal is different than the final price the user is paying
        if (!(subTotal == finalPrice)){
          //If two prices are different, alert the user of their savings in cost per min and also total savings 
          double subCostPerMin = (double) Math.round((subTotal/burnTimeTotal) * 100) / 100;
          System.out.println("");
          System.out.println("Without your discount, your cost per minute would have been: $" + subCostPerMin);
          double savings = (double) Math.round(subTotal - finalPrice);
          //Thank the user for their time and show them their savings
          System.out.println("");
          System.out.println("Thank you for shopping with us, you saved $" + savings + " today!");

        }else {
          //If the prices are the same, thank the user for their time. 
          System.out.println("");
          System.out.println("Thank you for shopping with us today! Visit again soon!");

        }
          //Prints histogram based on value of first candle
          System.out.print(candleOneQuant + " type 1 (" + candleOne.getName() + ") candles: ");
          //loop to print *
          for (int i = 0; i < candleOneQuant; i++) {
            System.out.print("*");
                }
          System.out.println("");
          
          //Prints histogram based on value of second candle
          System.out.print(candleTwoQuant + " type 2 (" + candleTwo.getName() + ") candles: ");
          //loop to print +
          for (int i = 0; i < candleTwoQuant; i++) {
            System.out.print("+");
                }
          System.out.println("");
          
          //Prints histogram based on value of second candle
          System.out.print(candleThreeQuant + " type 3 (" + candleThree.getName() + ") candles: ");
          //loop to print #
          for (int i = 0; i < candleThreeQuant; i++) {
            System.out.print("#");
                }
          System.out.println("");

          
          //Asks the user if they want to shop again at the candle shop!
          System.out.println("");
          System.out.println("Would you like to shop again? (yes/no)"); 
          shopAgain = scanner.nextLine(); 


}
    scanner.close();
        
    }//end main
}// end class
