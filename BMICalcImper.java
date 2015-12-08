import java.util.Scanner;

public class BMICalcImper
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double heightInches, weightPounds, bmiImper;

        System.out.print( "Your height in inches: " );
        heightInches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        weightPounds = keyboard.nextDouble();
        System.out.println( "" );

        bmiImper = ( weightPounds / ( heightInches * heightInches ) * 703 );

        System.out.print( "Your BMI is " + bmiImper );
    }
}
