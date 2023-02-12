package models;

import enums.DistTypeHills;
import enums.HowIfelt;
import enums.PaceType;
import enums.PerceivedEffort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class Hills {
    private String date;
    private String timeOfDay;
    private String workoutName;
    private String workoutDescription;
    private String distanceInput;
    private DistTypeHills distTypeHills;
    private String duration;
    private String pace;
    private PaceType paceType;
    private HowIfelt howIfelt;
    private PerceivedEffort perceivedEffort;
    private String minHr;
    private String avgHr;
    private String maxHr;
    private String caloriesBurned;
}
