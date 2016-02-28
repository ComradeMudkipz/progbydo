import java.util.Scanner;

public class BMICalcImper
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double heightFeet, heightInches, weightPounds, bmiImper;

        System.out.print( "Your height (feet only): " );
        heightFeet = keyboard.nextDouble();

        System.out.print( "Your height (inches): " );
        heightInches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        weightPounds = keyboard.nextDouble();
        System.out.println( "" );

        heightInches = ( heightFeet * 12 ) + heightInches;

        bmiImper = ( weightPounds / ( heightInches * heightInches ) * 703 ); 

        System.out.print( "Your BMI is " + bmiImper );
    }
}
