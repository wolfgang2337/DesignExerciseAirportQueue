import java.util.LinkedList;
import java.util.Queue;

public class AirportQueue {
    Queue<Passenger> normal;
    Queue<Passenger> priority;

    public AirportQueue() {
        normal = new LinkedList<>();
        priority = new LinkedList<>();
    }

    public void enterQueue(Passenger p) {
        if(!(p.getPType() == PassengerType.ECONOMY)) {
            priority.add(p);
        } else {
            normal.add(p);
        }
    }

    public Passenger sendThroughSecurity() {
        if(!priority.isEmpty()) {
            return priority.poll();
        } else {
            return normal.poll();
        }
    }

    public Passenger viewFrontOfQueue() {
        return null;
    }
}
