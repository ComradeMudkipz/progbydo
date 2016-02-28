import java.util.Scanner;

public class TwentyQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String size, type;

        System.out.println( "TWO QUESTIONS!" );
        System.out.println( "Think of an object, and I'll try to guess it." );
        System.out.println( "" );

        System.out.println( "Question 1) Is it an animal, vegetable, or mineral?" );
        System.out.print( "> " );
        type = keyboard.next();
        System.out.println( "" );
        if ( type.equals("animal") )
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );
            System.out.print( "> " );
            size = keyboard.next();
            System.out.println( "" );
            
            if ( size.equals("yes") )
            {
                System.out.println( "My guess is that you are thinking of a moose." );
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a squirrel." );
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
        }
        else if ( type.equals("vegetable") )
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );
            System.out.print( "> " );
            size = keyboard.next();
            System.out.println( "" );
            
            if ( size.equals("yes") )
            {
                System.out.println( "My guess is that you are thinking of a watermelon." );
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a carrot." ); 
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
        }
        else if ( type.equals("mineral") )
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );
            System.out.print( "> " );
            size = keyboard.next();
            System.out.println( "" );
            
            if ( size.equals("yes") )
            {
                System.out.println( "My guess is that you are thinking of your Porsche Boxster." );
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a Fiat." );
                System.out.println( "I would ask you if I'm right, but I don't actually care." );
            }
        }
        else
        {
            System.out.println( "ERROR! Terminating program. " );
        }

    }
}
