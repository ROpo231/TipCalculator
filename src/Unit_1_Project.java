import java.util.Scanner;
public class Unit_1_Project {
    public static void main(String[] args){
        //This welcomes the users and asks the user people in the group and the amount you will tip
        Scanner scan = new Scanner(System.in);
        boolean repT = true;
        System.out.println("Hello to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        int people = scan.nextInt();
        System.out.print("How much would you like to tip from (0 - 100): ");
        int tip = scan.nextInt();

        double price = 0;
        double number;

        //This part asks and adds the values of the cost
        while(repT) {
            System.out.print("What is the price of the item?: ");
            number = scan.nextDouble();
            if (number != -1) {
                price += number;
            } else {
                repT = false;
            }
        }

        //Everything below helps simplies and round the varables needed to be printed
        double totalCost = price*(((double)tip/100)+1);
        // this simpflies the values to print
        double totalTip = totalCost-price;
        double perPersonBTip = price/people;
        double tipPerPerson =(totalCost-price)/people;
        double totalCostPerPerson = (totalCost/people);
        //This multiplies the values to later round them and then divide them so it can get the rounded to the second decimal point value
        totalCost = totalCost*100;
        totalTip = totalTip*100;
        perPersonBTip = perPersonBTip*100;
        tipPerPerson =tipPerPerson*100;
        totalCostPerPerson = totalCostPerPerson*100;
        //This rounds the values
        totalCost= (Math.round(totalCost));
        totalTip = (Math.round(totalTip));
        perPersonBTip = (Math.round(perPersonBTip));
        tipPerPerson = (Math.round(tipPerPerson));
        totalCostPerPerson = (Math.round(totalCostPerPerson));
        //below divided the values to the proper form
        totalCost=totalCost/100;
        totalTip =totalTip /100;
        perPersonBTip = perPersonBTip/100;
        tipPerPerson = tipPerPerson/100;
        totalCostPerPerson =totalCostPerPerson/100;





        //this prints all the values
        System.out.println("Total bill before tip :" + price);
        System.out.println("Total percentage :" + tip + "%");
        System.out.println("Total tip :" + totalTip);
        System.out.println("Total bill with tip:" + totalCost );
        System.out.println("Per person cost before tip:" + perPersonBTip);
        System.out.println("Tip per person:" + tipPerPerson);
        System.out.println("Total cost per person:" + totalCostPerPerson);
        scan.nextLine();
        //This part asks the user if you liked the food
        System.out.println("Did you like your food Y/N : ");
        String liked= scan.nextLine();
        //This part responds to the input (by checking if the input is equal to a certian String using if or else) and prints one of the print statments
        if (liked.equals("Y")){
            System.out.println("Thanks for your feedback, we are happy you enjoyed. Hope to see you next time!!!");
        }
        else{
            System.out.println("Thanks for your feedback, we will try to improve next time. Hope to see you next time!!!");

        }

    }
}

