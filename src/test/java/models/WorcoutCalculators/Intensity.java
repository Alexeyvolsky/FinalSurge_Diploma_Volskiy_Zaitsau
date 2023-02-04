package models.WorcoutCalculators;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder(setterPrefix = "set")
public class Intensity {
    private String selectEvent;
    private String hours;
    private String minutes;
    private String seconds;
}
