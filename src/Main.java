import java.util.Scanner;

public class Main {
    public static void main(String[] args)


    {
        Scanner in = new Scanner(System.in);

        System.out.println("enter gallons in fuel tank: ");
        double fuelCap = in.nextDouble();
        System.out.println("enter mpg: ");
        double mpg = in.nextDouble();
        System.out.println("enter price of gas: ");
        double gasPrice = in.nextDouble();
        double miles100 = 100;

        double distance = (fuelCap * mpg);
        double costPer100 = ((miles100 / mpg)*gasPrice);

        System.out.println("you can go "+distance+"on this tank");
        System.out.println("the cost per 100 miles for your car is "+costPer100);


    }
}