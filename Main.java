import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int N;
        System.out.println("What is your upper bound?");
        N = scan.nextInt();
        printRandom3(N);
        
       double x1;
       double y1;
       double x2;
       double y2;
       System.out.println("give me two points as x1 y 1 x2 y2");
       x1 = scan.nextInt();
       y1 = scan.nextInt();
       x2 = scan.nextInt();
       y2 = scan.nextInt();
       System.out.println(calcSlope(x1, y1, x2, y2));
       System.out.println(calcSlope(0, 0, 1, 1));

       System.out.println("enter two doubles");
       double joe = scan.nextDouble();
       double doe = scan.nextDouble();
       System.out.println("distance: " + roundedDist(joe, doe));
        

    }
    
    public static void printRandom3(int num)
    {
       //Random whole numbers between a and b
       // (int) (Math.random() * (b-a+1) + a);
     //int lowerbond = 2;
      //nt upperbound = num + 2;
       //stem.out.println((int) (Math.random() * (upperbound - lowerbond + 1) lowerbond) );
    // System.out.println((int) (Math.random() * (upperbound - lowerbond + 1) lowerbond) );
      //System.out.println((int) (Math.random() * (upperbound - lowerbond + 1) lowerbond) );

        int lowerbound = 2;
        int upperbound = num + 2;
        System.out.println( (int) (Math.random() * (upperbound - lowerbound + 1) + lowerbound) );
         System.out.println( (int) (Math.random() * (upperbound - lowerbound + 1) + lowerbound) );
          System.out.println( (int) (Math.random() * (upperbound - lowerbound + 1) + lowerbound) );
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        // Do problem 2 here; replace code below
        //double yvalues = (y2 - y1);
        //double xvalues = (x2 - x1);
        //double something = (yvalues / xvalues);

        double calcSlope;
        calcSlope = ((y2 - y1) / (x2 - x1));
        return calcSlope;
    }
    
    public static int roundedDist(double a, double b)
    {
        // Do problem 3 here; replace code below
        double distance;
        distance = Math.abs(b - a);
        int rounded = (int) (distance + 0.5);
        return rounded;
    }
}
