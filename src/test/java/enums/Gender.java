package enums;

public enum Gender {

    MALE("  Male"), FEMALE(" Female"),
    MALE_CALORIC_NEEDS("\n" +
            "                                                    male\n" +
            "                                                "),
    FEMALE_CALORIC_NEEDS("\n" +
            "                                                    female\n" +
            "                                                ");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Gender fromString(String value) {
        for (Gender gender : Gender.values()) {
            if (gender.getName().equals(value)) {
                return gender;
            }
        }
        return null;
    }
}
