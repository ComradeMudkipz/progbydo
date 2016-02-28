import java.util.Scanner;

public class BMICalc
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double heightMetric, weightMetric, bmiMetric;

        System.out.print( "Your height in m: " );
        heightMetric = keyboard.nextDouble();

        System.out.print( "Your weight in kg: " );
        weightMetric = keyboard.nextDouble();
        System.out.println( "" );

        bmiMetric = ( weightMetric / ( heightMetric * heightMetric ) );

        System.out.print( "Your BMI is " + bmiMetric );
    }
}
