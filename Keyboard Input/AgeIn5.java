import java.util.Scanner;

public class AgeIn5
{
    public static void main( String [] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age, age_plus_five, age_minus_five;

        System.out.print( "Hello.  What is your name? " );
        name = keyboard.next();
        System.out.println( "" );

        System.out.print( "Hi, " + name + "!  How old are you? " );
        age = keyboard.nextInt();
        System.out.println( "" );

        age_plus_five = age + 5;
        age_minus_five = age - 5;

        System.out.println( "Did you know that in five years you will be " + age_plus_five + " years old?" );
        System.out.println( "And five years ago you were " + age_minus_five + "!  Imagine that!" );
    }
}
