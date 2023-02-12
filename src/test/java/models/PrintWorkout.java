package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class PrintWorkout {
    private String startingData;
    private String endingData;
}
