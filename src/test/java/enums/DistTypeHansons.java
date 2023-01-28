package enums;

public enum DistTypeHansons {

    MILES("mi"), KILOMETERS("km"), METERS("m");

    private final String name;

    DistTypeHansons(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static DistTypeHansons fromString(String value) {
        for (DistTypeHansons distTypeHansons : DistTypeHansons.values()) {
            if (distTypeHansons.getName().equals(value)) {
                return distTypeHansons;
            }
        }
        return null;
    }
}