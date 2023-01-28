package enums;

public enum DistanceTinman {

    KM5("5 km"), KM10("10 km"), HALF_MARATHON("Half Marathon"), MARATHON("Marathon"),
    METERS400("400 meters");

    private final String name;

    DistanceTinman(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static DistanceTinman fromString(String value) {
        for (DistanceTinman distanceTinman : DistanceTinman.values()) {
            if (distanceTinman.getName().equals(value)) {
                return distanceTinman;
            }
        }
        return null;
    }
}