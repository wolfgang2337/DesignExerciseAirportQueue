public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Alex", PassengerType.ECONOMY);
        Passenger p2 = new Passenger("Maya", PassengerType.STAFF);
        Passenger p3 = new Passenger("Brendan", PassengerType.ECONOMY);
        Passenger p4 = new Passenger("Melissa", PassengerType.VIP);
        AirportQueue q = new AirportQueue();
        q.enterQueue(p1);
        q.enterQueue(p2);
        q.sendThroughSecurity().printPassenger();
        q.enterQueue(p3);
        q.enterQueue(p4);
        q.sendThroughSecurity().printPassenger();
        q.sendThroughSecurity().printPassenger();
    }
}
