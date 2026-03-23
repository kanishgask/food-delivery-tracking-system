import java.util.HashMap;
import java.util.Map;

class Location {
    double latitude;
    double longitude;

    Location(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }
}

public class TrackingService {

    // Stores delivery partner location
    private Map<Integer, Location> deliveryLocations = new HashMap<>();

    // Update location
    public void updateLocation(int partnerId, double lat, double lon) {
        deliveryLocations.put(partnerId, new Location(lat, lon));
        System.out.println("Updated location for Partner " + partnerId);
    }

    // Track order (fetch location)
    public void trackOrder(int partnerId) {
        Location loc = deliveryLocations.get(partnerId);

        if (loc != null) {
            System.out.println("📍 Current Location -> Lat: " + loc.latitude + ", Lon: " + loc.longitude);
        } else {
            System.out.println("Location not available");
        }
    }

    public static void main(String[] args) {
        TrackingService tracker = new TrackingService();

        tracker.updateLocation(1, 13.0827, 80.2707); // Chennai coords
        tracker.trackOrder(1);
    }
}
