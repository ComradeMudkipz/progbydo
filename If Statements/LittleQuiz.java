import java.util.Scanner;

public class LittleQuiz
{
    public static void main( String [] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String response;
        int answer, answersRight;

        System.out.print( "Are you ready for a quiz? " );
        response = keyboard.next();
        System.out.println( "Okay, here it comes!" );
        System.out.println( "Please enter your answers with the correct number." );

        System.out.println( "Q1) What is the capital of Alaska?" );
        System.out.println( "        1) Melbourne " );
        System.out.println( "        2) Anchorage " );
        System.out.println( "        3) Juneau " );
        System.out.println( "" );

        System.out.print( "> " );
        answer = keyboard.nextInt();
        answersRight = 0;
        
        if ( answer == 3 )
        {
            answersRight = answersRight + 1;
            System.out.println( "That's right!" );
            System.out.println( "" );
        }
        else
        {
            System.out.println( "Sorry, the correct answer is 3) Juneau." );
            System.out.println( "" );
        }

        System.out.println( "Q2) Can you store the value 'cat' in a variable of type int?" );
        System.out.println( "        1) yes " );
        System.out.println( "        2) no " );
        System.out.println( "" );

        System.out.print( "> " );
        answer = keyboard.nextInt();

        if ( answer == 2 )
        {
            answersRight = answersRight + 1;
            System.out.println( "That's right!" );
            System.out.println( "" );
        }
        else
        {
            System.out.println( "Sorry, 'cat' is a string.  ints can only store numbers." );
            System.out.println( "" );
        }

        System.out.println( "Q3) What is the result of 9+6/3?" );
        System.out.println( "        1) 5 " );
        System.out.println( "        2) 11 " );
        System.out.println( "        3) 15/3 " );
        System.out.println( "" );

        System.out.print( "> " );
        answer = keyboard.nextInt();
        
        if ( answer == 2 )
        {
            answersRight = answersRight + 1;
            System.out.println( "That's right!" );
            System.out.println( "" );
        }
        else
        {
            System.out.println( "Sorry, the correct answer is 2) 11." );
            System.out.println( "" );
        }
        System.out.println( "" );

        System.out.println( "Overall, you got " + answersRight + " out of 3 correct." );
        System.out.println( "Thanks for playing!" );
    }
}
