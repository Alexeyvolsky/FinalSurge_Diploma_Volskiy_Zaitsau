package enums;

public enum DistTypePaceCalculator {

    MILES("Miles"), KILOMETERS("Kilometers"), METERS("Meters"), YARDS("Yards"), FEET("Feet");

    private final String name;

    DistTypePaceCalculator(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static DistTypePaceCalculator fromString(String value) {
        for (DistTypePaceCalculator distTypePaceCalculator : DistTypePaceCalculator.values()) {
            if (distTypePaceCalculator.getName().equals(value)) {
                return distTypePaceCalculator;
            }
        }
        return null;
    }
}