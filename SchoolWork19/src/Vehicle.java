public class Vehicle {
//    number of seats
//number of wheels
//    attributes, class fields

    private int numberOfSeats;
    private int numberOfWheels;

//    constructor

    public Vehicle(int numberOfSeats, int numberOfWheels) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
    }


//    access methods, getters

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }


//    behaviour, method drive()
public void drive (){
    System.out.println("Driving on its " + this.numberOfWheels + " wheels");

}

//    toString

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }


//

}
