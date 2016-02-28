// TODO: Implement error handling

import java.util.Scanner;

public class SpaceBoxing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        int planet;
        double weight, venusWeight, marsWeight, jupiterWeight, saturnWeight,
               uranusWeight, neptuneWeight;

        System.out.print( "Please enter your current earth weight: (# only) " );
        weight = keyboard.nextDouble();

        venusWeight = weight * 0.78;
        marsWeight = weight * 0.39;
        jupiterWeight = weight * 2.65;
        saturnWeight = weight * 1.17;
        uranusWeight = weight * 1.05;
        neptuneWeight = weight * 1.23;

        System.out.println( "I have information for the following planets:" );
        System.out.println( "1. Venus     2. Mars     3. Jupiter" );
        System.out.println( "4. Saturn    5. Uranus   6. Neptune" );
        System.out.println( "" );

        System.out.print( "Which planet are you visiting? (#'s only) " );
        planet = keyboard.nextInt();

        if ( planet == 1 )
        {
            System.out.println( "Your weight would be " + venusWeight + " pounds on that planet." );
        }
        else if ( planet == 2 )
        {
            System.out.println( "Your weight would be " + marsWeight + " pounds on that planet." );
        }
        else if ( planet == 3 )
        {
            System.out.println( "Your weight would be " + jupiterWeight + " pounds on that planet." );
        }
        else if ( planet == 4 )
        {
            System.out.println( "Your weight would be " + saturnWeight + " pounds on that planet." );
        }
        else if ( planet == 5 )
        {
            System.out.println( "Your weight would be " + uranusWeight + " pounds on that planet." );
        }
        else if ( planet == 6 )
        {
            System.out.println( "Your weight would be " + neptuneWeight + " pounds on that planet." );
        }
        else
        {
            System.out.println ( "ERROR: Invalid number." );
        }
    }
}
