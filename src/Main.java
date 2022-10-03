import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double sideL = 0;
        double sideW = 0;
        String trash = "";

        System.out.print("Enter the longer side of the rectangle: ");

        if(in.hasNextDouble()) {
            sideL = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said the length of the side was " + trash + ". That is not a valid number!");
            System.out.println("Run the program again and enter a valid number!");
            System.exit(0);
        }

        System.out.print("Enter the shorter side of the rectangle: ");

        if(in.hasNextDouble()) {
            sideW = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said the length of the side was " + trash + ". That is not a valid number!");
            System.out.println("Run the program again and enter a valid number!");
            System.exit(0);
        }

        double area = sideL * sideW;
        double perimeter = sideL + sideL + sideW + sideW;
        double diagnol = Math.sqrt((sideL * sideL) + (sideW * sideW));

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagnol within the rectangle is " + diagnol);





    }
}