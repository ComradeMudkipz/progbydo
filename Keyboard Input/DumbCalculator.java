import java.util.Scanner;

public class DumbCalculator
{
    public static void main( String [] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double FirstNumber, SecondNumber, ThirdNumber, divisor;

        System.out.print( "What is your first number? " );
        FirstNumber = keyboard.nextDouble();

        System.out.print( "What is your second number? " );
        SecondNumber = keyboard.nextDouble();

        System.out.print( "What is your third number? " );
        ThirdNumber = keyboard.nextDouble();
        System.out.println( "" );

        divisor = ( ( FirstNumber + SecondNumber + ThirdNumber ) / 2 );

        System.out.println( "( " + FirstNumber + " + " + SecondNumber + " + " + ThirdNumber + " ) / 2 is... " + divisor );
    }
}
