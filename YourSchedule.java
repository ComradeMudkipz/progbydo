public class YourSchedule
{
    public static void main( String[] args )
    {
        String course1, course2, course3, course4, course5, course6,
               teacher1, teacher2, teacher3, teacher4, teacher5, teacher6;

        course1 = "       Marching Band";
        course2 = "   English 12 Honors";
        course3 = "      Weight Lifting";
        course4 = "            Yearbook";
        course5 = "US Government Honors";
        course6 = "  Precalculus Honors";

        // TODO: Assign teachers
        teacher1 = " Mr. Suppola";
        teacher2 = "            ";
        teacher3 = "            ";
        teacher4 = "Mr. Jurvelin";
        teacher5 = "            ";
        teacher6 = " Ms. Foresta";

        // Fix formatting
        System.out.println( "+------------------------------------------------------+" );
        System.out.println( "| 1 | " + course1 + " | " + teacher1 + "              |" );
        System.out.println( "| 2 | " + course2 + " | " + teacher2 + "              |" );
        System.out.println( "| 3 | " + course3 + " | " + teacher3 + "              |" );
        System.out.println( "| 4 | " + course4 + " | " + teacher4 + "              |" );
        System.out.println( "| 5 | " + course5 + " | " + teacher5 + "              |" );
        System.out.println( "| 6 | " + course6 + " | " + teacher6 + "              |" );
        System.out.println( "+------------------------------------------------------+" );
    }
}
