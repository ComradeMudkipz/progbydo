public class ElseAndIf
{
    public static void main( String[] args )
    {
        int people = 30;
        int cars = 40;
        int buses = 15;

        // "else if" is a conditional fulfilled under appropriate conditions
        // "else" is a conditional in which prior conditions do not fulfill an operation
        if ( cars > people)
        {
            System.out.println( "We should take the cars." );
        }
        // removing "else" in "else if" would disrupt flow of execution if prior
        // conditional is not fulfilled
        else if ( cars < people )
        {
            System.out.println( "We should not take the cars." );
        }
        else
        {
            System.out.println( "We can't decide." );
        }

        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }

        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's just stay home then." );
        }
    }
}
