//Angelo Fontana 9/30/2020
import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {
        /*
    }
        CircleC circlec = new CircleC(3);
        System.out.println(circlec);

        CubeSA CSA = new CubeSA(7);
        System.out.println(CSA);

        Distance one = new Distance(1, 9, 3, 6);
        System.out.println(one);

        SphereVolume SV = new SphereVolume(4.7);
        System.out.println(SV);
        Line steve = new Line(.9, 7, 1);
        System.out.println(steve);
         */
        Scanner readIn = new Scanner(System.in);
        Scanner doubleIn = new Scanner(System.in);
        System.out.println("Welcome tooooo.... RANDOM FORMULA CALCULATOR 9000!!!!");
        System.out.println("To solve for the circumference of a circle, press 1 ; To solve for the suaurce area of a square, press 2; ");
        System.out.println("To solve for the Distance formula, press 3 ; To msolve for the volume of a sphere, press 4");
        System.out.print("To solve for a Line, press 5: ");
        int userNum = readIn.nextInt();
        if (userNum > 5) {
            System.out.println("Hmmm... something went wrong.");
            System.exit(1);
        }
        else if (userNum <= 0) {
            System.out.println("Hmmm... something went wrong.");
            System.exit(2);
        }
        else if (userNum == 1) {
            System.out.print("Enter circle radius: ");
            CircleC user = new CircleC(doubleIn.nextDouble()) ;
            System.out.println(user);
        }
        else if (userNum == 2)  {
            System.out.print("Enter side length: ");
            CubeSA user = new CubeSA(doubleIn.nextDouble());
            System.out.println(user);
        }
        else if (userNum == 3) {
            System.out.print("Enter X 1: ");
            double XOne = doubleIn.nextDouble();
            System.out.print("Enter y 1: ");
            double YOne = doubleIn.nextDouble();
            System.out.print("Enter x 2: ");
            double XTwo = doubleIn.nextDouble();
            System.out.print("Enter y 2: ");
            double YTwo = doubleIn.nextDouble();
            Distance user = new Distance(XOne, YOne, XTwo, YTwo);
            System.out.println(user);
        }
        else if (userNum == 4) {
            System.out.print("Enter radius: ");
            SphereVolume user = new SphereVolume(doubleIn.nextDouble());
            System.out.println(user);
        }
        else if (userNum ==5) {
            System.out.print("(for y = m*x + b) Enter m: ");
            double m = doubleIn.nextDouble();
            System.out.print("Enter x: ");
            double x = doubleIn.nextDouble();
            System.out.print("Enter b: ");
            double b = doubleIn.nextDouble();
            Line user = new Line(m, x, b);
            System.out.println(user);
        }
    }
}
