import java.util.Scanner;

public class MoreUserInputOfData
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        String first_name, last_name, user_login;
        int grade, student_id;
        double gpa;
        
        System.out.println( "Please enter the following information so I can sell it for a profit!" );
        System.out.println( "" );

        System.out.print( "First name: " );
        first_name = keyboard.next();

        System.out.print( "Last name: " );
        last_name = keyboard.next();
        
        System.out.print( "Grade (9-12): " );
        grade = keyboard.nextInt();

        System.out.print( "Student ID: " );
        student_id = keyboard.nextInt();

        System.out.print( "User login: " );
        user_login = keyboard.next();
        
        System.out.print( "GPA (0.0-4.0): " );
        gpa = keyboard.nextDouble();
        System.out.println( "" );

        System.out.println( "Your information: " );
        System.out.println( "        Login: " + user_login );
        System.out.println( "        ID:    " + student_id );
        System.out.println( "        Name:  " + last_name + ", " + first_name );
        System.out.println( "        GPA:   " + gpa );
        System.out.println( "        Grade: " + grade );
    }
}
