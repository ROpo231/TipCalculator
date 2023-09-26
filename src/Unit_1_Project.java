import java.util.Scanner;
public class Unit_1_Project {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        boolean repT = true;
        System.out.println("Hello to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        int people = scan.nextInt();
        System.out.print("How much would you like to tip from (0 - 100): ");
        double tip = scan.nextInt();

        double price = 0;
        double number = 0;
        //int amountOfPeople = 0;
        while(repT) {
            System.out.print("What is the price of the item?: ");
            number = scan.nextDouble();
            if (number != -1){
                price += number;
            }
            else {
                repT = false;
            }
        }


        double totalCost = price*((tip/100)+1);
        System.out.println("Total bill before tip :" + price);
        System.out.println("Total percentage :" + tip + "%");
        System.out.println("Total tip :" + (totalCost-price));
        System.out.println("Total bill with tip:" + totalCost );
        System.out.println("Per person cost before tip:" + (price/people));
        System.out.println("Tip per person:" +((totalCost-price)/people) );
        System.out.println("Total cost per person:" + (totalCost/people));
    }
}

