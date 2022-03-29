public class Passenger {
    String name;
    PassengerType pType;

    public Passenger(String name, PassengerType pType) {
        this.name = name;
        this.pType = pType;
    }

    public PassengerType getPType() {
        return this.pType;
    }

    public void printPassenger() {
        System.out.println(String.format("I am %s and I am of type %s", name, pType));
    }

    //later add getName method
}
