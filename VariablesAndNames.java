public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        // Declares number of cars to 100
        cars = 100;
        // Declares number of spaces in each car to 4
        space_in_a_car = 4.0;
        // Declares number of drivers to 30
        drivers = 30;
        // Declares number of passengers to 90
        passengers = 90;
        // Declares number of empty cars to cars subtracted by drivers (100 - 30 = 70)
        cars_not_driven = cars - drivers;
        // Sets number of cars driven to number of drivers
        cars_driven = drivers;
        // Declares available amount of carpools using cars driven multiplied by spaces in each car
        carpool_capacity = cars_driven * space_in_a_car;
        // Calculates the amount of passengers needed in each car for possible transportation
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available.");
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
